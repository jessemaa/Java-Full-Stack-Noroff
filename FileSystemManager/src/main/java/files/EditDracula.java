package main.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import main.java.logging.LoggingTime;

// Class for editing the dracula.txt file
public class EditDracula {
    static String fileName = "src/main/resources/Dracula.txt";

    // Gets the name of the file "Dracula.txt"
    public static void getName() {
        long now = System.currentTimeMillis();
        File f1 = new File(fileName);
        String name = f1.getName();
        System.out.println(name);
        long after = System.currentTimeMillis();
        LoggingTime.logDateAndMs(now, after, name);
    }

    // Counts the file size in bytes
    public static void getFileSize() {
        long now = System.currentTimeMillis();
        File f2 = new File(fileName);
        long fileSize = f2.length();
        String text = "The size of the file: ";
        var result = text + fileSize + " bytes";
        System.out.format(result);
        long after = System.currentTimeMillis();
        LoggingTime.logDateAndMs(now, after, result);
    }

    // Counts the line count in "Dracula.txt"
    public static void getLineCount() {
        long now = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            var command = "Lines counted: " + lines;
            System.out.println(command);
            reader.close();
            long after = System.currentTimeMillis();
            LoggingTime.logDateAndMs(now, after, command);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Search for specific word in the text file
    public static void getWord() throws IOException {
        long now = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word to be searched:");
        String searchWord = scanner.nextLine().toLowerCase();
        File f4 = new File(fileName);
        String[] words = null;
        FileReader f3 = new FileReader(f4);
        BufferedReader bReader = new BufferedReader(f3);
        String string;     
        int count = 0;

        while ((string = bReader.readLine()) != null) {
            words = string.split(" ");
            for (String word : words) {
                if (word.toLowerCase().equals(searchWord)) {
                    count++;
                }
            }
        }

        if (count != 0) {
            var command = "The given word \""+ searchWord + "\" is present for " + count + " times in the file.";
            System.out.println(command);
            long after = System.currentTimeMillis();
            LoggingTime.logDateAndMs(now, after, command);
        } else {
            var command = "The given word \"" + searchWord + "\" is not present in the file.";
            System.out.println(command);
            long after = System.currentTimeMillis();
            LoggingTime.logDateAndMs(now, after, command);
        }
    }
    
}
