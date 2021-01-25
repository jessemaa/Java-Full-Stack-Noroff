package main.java.files;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class ListFiles {
    // Path to our manipulated files
    static File directoryPath = new File("src/main/resources");

    // Lists all files in directoryPath ^
    public static void getAllFiles() {
        System.out.println("All the files listed in 'resources' folder: ");
        String contents[] = directoryPath.list();

        // Print them out one by one by indexing
        for (int i = 0; i < contents.length; i++) {
           System.out.println(contents[i]);
        }
    }

    // Scan for the files ending in different extensions
    public static void getFilesByExtension() {
        Scanner extensionScanner = new Scanner(System.in);
        System.out.println("What extension are you seeking? Choose one: .txt, .png, .jfif, .jpg or .jpeg");
        String ext = extensionScanner.nextLine();

        // Filter the files
        FilenameFilter textFilefilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                if (lowercaseName.endsWith(ext)) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        // Make a list of the files by given extension
        String filesList[] = directoryPath.list(textFilefilter);
        System.out.println("List of the files by given extension: ");
        for (String fileName : filesList) {
            System.out.println(fileName);
        }
    }
}
