package org.gvozdetscky.main;

import org.gvozdetscky.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;


/**
 * Created by Egor on 14.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Display.create(800, 600, "Tanks");

        Timer timer = new Timer(1000 / 60, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Display.render();
            }
        });

        timer.setRepeats(true);
        timer.start();
    }
}
