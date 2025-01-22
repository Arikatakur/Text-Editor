package com.texteditor;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        boolean isHeadless = args.length > 0 && args[0].equals("--headless");
        if (isHeadless || GraphicsEnvironment.isHeadless()) {
            System.out.println(MainConstants.HEADLESS_RUN);
        } else {

                    //main frame
            JFrame frame = new JFrame("Text Editor");
                    //TextArea
            JTextArea textArea = new JTextArea();
                    //scrollPane
            JScrollPane scrollPane = new JScrollPane(textArea);
                    //menu
            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenuItem newItem = new JMenuItem("New");
            JMenuItem openItem = new JMenuItem("Open");
            JMenuItem saveItem = new JMenuItem("Save");
            JMenuItem exitItem = new JMenuItem("Exit");
            fileMenu.add(newItem);
            fileMenu.add(openItem);
            fileMenu.add(saveItem);
            fileMenu.addSeparator();
            fileMenu.add(exitItem);
            menuBar.add(fileMenu);


            frame.setJMenuBar(menuBar);
            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}