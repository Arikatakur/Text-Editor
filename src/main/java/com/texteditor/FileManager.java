package com.texteditor;

import javax.swing.*;

public class FileManager {
    public static void saveAndSubmit(String content) {
        System.out.println("Content saved and submitted:");
        System.out.println(content);
    }
    public static void handleNewAction(JFrame frame, JTextArea textArea) {
        if (!textArea.getText().isEmpty()) {
            int choice = JOptionPane.showConfirmDialog(frame,
                    "Do you want to save changes before creating a new file?",
                    "Unsaved Changes",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                saveAndSubmit(textArea.getText());
                textArea.setText("");
            } else if (choice == JOptionPane.NO_OPTION) {
                textArea.setText("");
            }
        } else {
            textArea.setText("");
        }
    }
}
