package com.texteditor;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        boolean isHeadless = args.length > 0 && args[0].equals("--headless");
        if (isHeadless || GraphicsEnvironment.isHeadless()) {
            System.out.println(MainConstants.HEADLESS_RUN);
        } else {
            JFrame frame = new JFrame("Text Editor");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}