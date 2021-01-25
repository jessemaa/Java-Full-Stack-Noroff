import java.io.IOException;
import java.util.Scanner;
import main.java.io.*;
import main.java.files.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Utilize a scanner and send it as attribute to "Inputs"-method
        Scanner scanner = new Scanner(System.in);
        Inputs userInput = new Inputs();
        int mainMenuOption = userInput.printMainMenu(scanner);

        // As long as the option is not 0, we show menu
        while (true) {

            if (mainMenuOption == 0) {
                System.out.println("Shutting down..");
                break;
            }

            // Based on the option we do different things
            switch (mainMenuOption) {
                case 1:
                    ListFiles.getAllFiles();
                    break;
                case 2:
                    ListFiles.getFilesByExtension();
                    break;
                case 3:
                    FileManipulation.getFileName();
                    break;
                default:
                    System.out.println("Please, insert a valid command!");
            }
        // Ask for another option
        mainMenuOption = userInput.printMainMenu(scanner);

        }
    }
    
}
