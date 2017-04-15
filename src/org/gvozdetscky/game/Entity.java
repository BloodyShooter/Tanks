package org.gvozdetscky.game;

import org.gvozdetscky.io.Input;

import java.awt.*;

/**
 * Created by Egor on 15.04.2017.
 */
public abstract class Entity {
    public final EntityType type;

    protected float x;
    protected float y;

    protected Entity(EntityType type, float x, float y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    protected abstract void update(Input input);

    protected abstract void render(Graphics2D graphics2D);
}
