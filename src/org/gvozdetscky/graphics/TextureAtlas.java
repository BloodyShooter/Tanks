package org.gvozdetscky.graphics;

import org.gvozdetscky.utils.ResourseLoader;

import java.awt.image.BufferedImage;

/**
 * Created by Egor on 15.04.2017.
 */
public class TextureAtlas {
    BufferedImage image;

    public TextureAtlas(String imageName) {
        image = ResourseLoader.loadImage(imageName);
    }

    public BufferedImage cut(int x, int y, int w, int h) {
        return image.getSubimage(x, y, w, h);
    }
}
