package util;

import model.Log;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Logger {

    // Ghi log vào file CSV ngay lập tức
    public static void logToCSV(Log log, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(log.toCSV());
            writer.newLine();  // Thêm dòng mới sau mỗi log
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
