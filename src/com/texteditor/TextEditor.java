package com.texteditor;

public class TextEditor {
    public static void main(String[] args) {
        // Enable headless mode
        System.setProperty("java.awt.headless", "true");

        // Print a message to confirm the program is running
        System.out.println("Text Editor application started in headless mode!");

        // Perform non-GUI operations here
        System.out.println("Performing text editing tasks...");
    }
}