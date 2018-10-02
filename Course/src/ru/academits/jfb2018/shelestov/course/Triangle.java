package ru.academits.jfb2018.shelestov.course;

class Triangle {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    boolean isLine() {
        double epsilon = 1.0e-10;
        return Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) <= epsilon;
    }

    double calculateArea() {
        double sideALength = calculateSideLength(x1, y1, x2, y2);
        double sideBLength = calculateSideLength(x2, y2, x3, y3);
        double sideCLength = calculateSideLength(x3, y3, x1, y1);

        double halfPerimeter = (sideALength + sideBLength + sideCLength) / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - sideALength) *
                (halfPerimeter - sideBLength) * (halfPerimeter - sideCLength));
    }

    private double calculateSideLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
