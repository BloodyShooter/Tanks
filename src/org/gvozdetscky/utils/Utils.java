package org.gvozdetscky.utils;

import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by Egor on 15.04.2017.
 */
public class Utils {
    public static BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        newImage.getGraphics().drawImage(image, 0, 0, width, height, null);

        return newImage;
    }

    public static int[][] levelParser(String filePath) {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
