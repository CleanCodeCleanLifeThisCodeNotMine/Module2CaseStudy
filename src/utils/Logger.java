package utils;

import model.Log;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Logger {
    public static void logToCSV(List<Log> logs, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Log log : logs) {
                writer.write(log.toCSV() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
