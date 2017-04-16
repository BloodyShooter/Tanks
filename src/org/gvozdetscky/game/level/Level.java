package org.gvozdetscky.game.level;

import org.gvozdetscky.game.Game;
import org.gvozdetscky.graphics.TextureAtlas;
import org.gvozdetscky.utils.Utils;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Egor on 15.04.2017.
 */
public class Level {

    public static final int TILE_SCALE = 8;
    public static final int TILE_IN_GAME_SCALE = 2;
    public static final int SCALED_TILE_SIZE = TILE_SCALE * TILE_IN_GAME_SCALE;
    public static final int TILES_IN_WIDTH = Game.WIDTH / SCALED_TILE_SIZE;
    public static final int TILES_IN_HEIGHT = Game.HEIGHT / SCALED_TILE_SIZE;

    private Integer[][] tileMap;
    private Map<TileType, Tile> tiles = new HashMap<>();
    private List<Point> grassCords;

    public Level(TextureAtlas atlas) {
        tiles = new HashMap<>();
        tiles.put(TileType.BRICK, new Tile(atlas.cut(32 * TILE_SCALE, 0 * TILE_SCALE, TILE_SCALE, TILE_SCALE),
                TILE_IN_GAME_SCALE, TileType.BRICK));
        tiles.put(TileType.METAL, new Tile(atlas.cut(32 * TILE_SCALE, 2 * TILE_SCALE, TILE_SCALE, TILE_SCALE),
                TILE_IN_GAME_SCALE, TileType.METAL));
        tiles.put(TileType.WATER, new Tile(atlas.cut(32 * TILE_SCALE, 4 * TILE_SCALE, TILE_SCALE, TILE_SCALE),
                TILE_IN_GAME_SCALE, TileType.WATER));
        tiles.put(TileType.GRASS, new Tile(atlas.cut(34 * TILE_SCALE, 4 * TILE_SCALE, TILE_SCALE, TILE_SCALE),
                TILE_IN_GAME_SCALE, TileType.GRASS));
        tiles.put(TileType.ICE, new Tile(atlas.cut(36 * TILE_SCALE, 4 * TILE_SCALE, TILE_SCALE, TILE_SCALE),
                TILE_IN_GAME_SCALE, TileType.ICE));
        tiles.put(TileType.EMPTY, new Tile(atlas.cut(36 * TILE_SCALE, 6 * TILE_SCALE, TILE_SCALE, TILE_SCALE),
                TILE_IN_GAME_SCALE, TileType.EMPTY));
        tileMap = Utils.levelParser("res/level.lvl");
        grassCords = new ArrayList<>();
        for (int i = 0; i < tileMap.length; i++) {
            for (int j =0; j < tileMap[i].length; j++) {
                Tile tile = tiles.get(TileType.fromNumeric(tileMap[i][j]));
                if (tile.getType() == TileType.GRASS)
                    grassCords.add(new Point(j * SCALED_TILE_SIZE,i * SCALED_TILE_SIZE));
            }
        }
    }

    public void update() {

    }

    public void render(Graphics2D graphics2D) {
        for (int i = 0; i < tileMap.length; i++) {
            for (int j = 0; j < tileMap[i].length; j++) {
                Tile tile = tiles.get(TileType.fromNumeric(tileMap[i][j]));
                if (tile.getType() != TileType.GRASS)
                    tiles.get(TileType.fromNumeric(tileMap[i][j])).render(graphics2D, j * SCALED_TILE_SIZE,
                            i * SCALED_TILE_SIZE);
            }
        }
    }

    public void renderGrass(Graphics2D graphics2D) {
        for (Point point: grassCords) {
            tiles.get(TileType.GRASS).render(graphics2D, point.x, point.y);
        }
    }
}
