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
            JTextArea textArea = new JTextArea();
            JScrollPane scrollPane = new JScrollPane(textArea);
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

            JMenu editMenu = new JMenu("Edit");
            JMenuItem cutItem = new JMenuItem("Cut");
            JMenuItem copyItem = new JMenuItem("Copy");
            JMenuItem pasteItem = new JMenuItem("Paste");
            editMenu.add(cutItem);
            editMenu.add(copyItem);
            editMenu.add(pasteItem);
            menuBar.add(editMenu);

            JButton saveAndSubmitButton = new JButton("Save and Submit");

            frame.setJMenuBar(menuBar);
            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(saveAndSubmitButton, BorderLayout.SOUTH);

            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}