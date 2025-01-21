package main.java.com.texteditor;

import javax.swing.*;
import java.awt.*;

public class TextEditor {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("Text Editor");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text area for text input and editing
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14)); // Set a monospaced font
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Add the text area to a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Make the window visible
        frame.setVisible(true);

        // Print a message to confirm the program is running
        System.out.println("Text Editor application started with GUI!");
    }
}