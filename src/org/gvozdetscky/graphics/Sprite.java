package org.gvozdetscky.graphics;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Egor on 15.04.2017.
 */
public class Sprite {
    private SpriteSheet sheet;
    private float scale;

    public Sprite(SpriteSheet sheet, float scale) {
        this.sheet = sheet;
        this.scale = scale;
    }

    public void rendeer(Graphics2D graphics2D, float x, float y) {
        BufferedImage image = sheet.getSprite(0);
        graphics2D.drawImage(image, (int) x, (int) y, (int) (image.getWidth() * scale), (int) (image.getHeight() * scale), null);
    }
}
