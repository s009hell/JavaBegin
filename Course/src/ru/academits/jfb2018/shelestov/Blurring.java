package ru.academits.jfb2018.shelestov;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blurring {

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        BufferedImage imageResult = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        imageResult.setData(image.getRaster());

        WritableRaster raster = image.getRaster();
        WritableRaster rasterResult = imageResult.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;

        double[] pixel = new double[COLORS_COUNT_IN_RGB];
        int[] pixelResult = new int[COLORS_COUNT_IN_RGB];

        double pixelTable = 1.0 / 5.0;

        double[][] h = {
                {pixelTable, pixelTable, pixelTable, pixelTable, pixelTable},
                {pixelTable, pixelTable, pixelTable, pixelTable, pixelTable},
                {pixelTable, pixelTable, pixelTable, pixelTable, pixelTable},
                {pixelTable, pixelTable, pixelTable, pixelTable, pixelTable},
                {pixelTable, pixelTable, pixelTable, pixelTable, pixelTable},
        };

        for (int j = 1; j < raster.getHeight() - 1; ++j) {
            for (int i = 1; i < raster.getWidth() - 1; ++i) {
                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    pixel[k] = 0;

                    for (int m = -1; m <= 1; m++) {
                        for (int n = -1; n <= 1; n++) {
                            rasterResult.getPixel(i + n, j + n, pixelResult);
                            pixel[k] += pixelResult[k] * h[n + 1][n + 1];
                        }
                    }
                    if (pixel[k] > 255) {
                        pixel[k] = 255;
                    } else if (pixel[k] < 0) {
                        pixel[k] = 0;
                    }
                }
                raster.setPixel(i, j, pixel);
            }
        }
        ImageIO.write(image, "png", new File("out.png"));
    }
}

