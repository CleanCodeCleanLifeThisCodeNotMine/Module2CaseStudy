package model;

public class Log {
    private String action;
    private String timestamp;

    public Log(String action, String timestamp) {
        this.action = action;
        this.timestamp = timestamp;
    }

    public String toCSV() {
        return action + "," + timestamp;
    }
}
