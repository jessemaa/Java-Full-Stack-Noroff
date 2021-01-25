package main.java.io;
import java.util.Scanner;

public class Inputs {
    // Presents the user with main menu
    public int printMainMenu(Scanner scanner) {
        System.out.println("Choose an option:\n(1) List files in folder\n(2) Get files by extension\n(3) Manipulate dracula.txt\n(0) Exit");
        return Integer.parseInt(scanner.nextLine());
    }

    // Presents the user with sub menu
    public int printSubMenu(Scanner scanner) {
        System.out.println("Choose an option:\n(1) Get name of the file\n(2) Get size of the file\n(3) Check how many lines\n(4) Search count for specific word\n(0) Return");
        return Integer.parseInt(scanner.nextLine());
    }
    
}
