package org.gvozdetscky.graphics;

import org.gvozdetscky.utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Egor on 15.04.2017.
 */
public class Sprite {
    private SpriteSheet sheet;
    private float scale;
    private BufferedImage image;

    public Sprite(SpriteSheet sheet, float scale) {
        this.sheet = sheet;
        this.scale = scale;
        image = sheet.getSprite(0);
        image = Utils.resize(image, (int) (image.getWidth() * scale), (int) (image.getHeight() * scale));
    }

    public void rendeer(Graphics2D graphics2D, float x, float y) {

        graphics2D.drawImage(image, (int) x, (int) y, null);
    }
}
