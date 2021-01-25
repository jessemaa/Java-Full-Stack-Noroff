package main.java.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingTime {
    public static void logDateAndMs(long now, long after, String command) {
        // Creates a date-time formatter for the logs to look pretty
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dateNow = LocalDateTime.now();

        // Creates a log-file called logs
        try {
            File myObj = new File("logs.txt");
            if (myObj.createNewFile()) {
                System.out.println();
            } else {
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Writes to the log file without overwriting existing text
        try {
            FileWriter myWriter = new FileWriter("logs.txt", true);
            myWriter.write("\n" + dtf.format(dateNow) + ": " + command + "\n");
            myWriter.write("The function took " + (Math.subtractExact(after, now)) + "ms to execute");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
