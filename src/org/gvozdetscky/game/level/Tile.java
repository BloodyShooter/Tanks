package org.gvozdetscky.game.level;

import org.gvozdetscky.graphics.SpriteSheet;
import org.gvozdetscky.utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Egor on 15.04.2017.
 */
public class Tile {
    private BufferedImage image;
    private TileType type;

    protected Tile(BufferedImage image,int scale, TileType type) {
        this.type = type;
        this.image = Utils.resize(image, image.getWidth() * scale, image.getHeight() * scale);
    }

    protected void render(Graphics2D graphics2D, int x, int y) {
        graphics2D.drawImage(image, x, y, null);
    }

    protected TileType getType() {
        return type;
    }
}
