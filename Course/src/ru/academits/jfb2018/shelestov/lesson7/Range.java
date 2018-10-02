package ru.academits.jfb2018.shelestov.lesson7;

class Range {
    private double from;
    private double to;

    Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    Range() {
    }

    void setFrom(double from) {
        this.from = from;
    }

    double getFrom() {
        return from;
    }

    void setTo(double to) {
        this.to = to;
    }

    double getTo() {
        return to;
    }

    boolean isInside(double insideNumber) {
        return insideNumber >= from && insideNumber <= to;
    }

    double calculateLength() {
        return to - from;
    }
}
