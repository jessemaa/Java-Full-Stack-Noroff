package main.java.files;

import main.java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileManipulation {

    // Create a scanner for the user to be able to select sub menu option
    public static void getFileName() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Inputs userInput = new Inputs();
        int subMenuOption = userInput.printSubMenu(scanner);

        // While the option is not 0 (return), show sub menu
        while (true) {
            if (subMenuOption == 0) {
                System.out.println("Returning..");
                break;
            }
            
            // Options for file manipulation
            switch (subMenuOption) {
                case 1:
                    EditDracula.getName();
                    break;
                case 2:
                    EditDracula.getFileSize();
                    break;
                case 3:
                    EditDracula.getLineCount();
                    break;
                case 4:
                    EditDracula.getWord();
                    break;
                default:
                    System.out.println("No command found!");
            }
            // Get new option
            subMenuOption = userInput.printSubMenu(scanner);
        }
    }
}
