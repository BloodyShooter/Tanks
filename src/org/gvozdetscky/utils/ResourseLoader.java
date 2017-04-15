package org.gvozdetscky.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Egor on 15.04.2017.
 */
public class ResourseLoader {
    public static final String PATH = "res/";

    public static BufferedImage loadImage(String fileName) {
        BufferedImage image = null;

        try {
            image = ImageIO.read(new File(PATH + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return image;
    }
}
