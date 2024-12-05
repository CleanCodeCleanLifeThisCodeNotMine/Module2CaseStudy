package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    private String action;
    private String timestamp;

    public Log(String action) {
        this.action = action;
        // Real time for the prO
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String toCSV() {
        return action + "," + timestamp;
    }
}
