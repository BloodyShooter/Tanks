package org.gvozdetscky.display;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Egor on 14.04.2017.
 */
public abstract class Display {

    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    public static void create(int width, int height,  String title) {
        if (created)
            return;
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = new Canvas() {
            public void paint(Graphics graphics) {
                super.paint(graphics);
                render(graphics);
            }
        };

        Dimension size = new Dimension(width, height);
        content.setPreferredSize(size);
        content.setBackground(Color.BLACK);

        window.setResizable(false);
        window.getContentPane().add(content);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public static void render() {
        content.repaint();
    }

    private static void render(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillOval(400 - 50, 300 - 50, 100, 100);
    }
}
