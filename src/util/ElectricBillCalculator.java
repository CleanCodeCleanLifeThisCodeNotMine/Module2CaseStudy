package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ElectricBillCalculator {

    private static long startTime;  // To track when the AC is turned on
    private static final double CONSUMPTION_PER_10_SECONDS = 5.0; // 5 kWh per 10 seconds
    private static final double PRICE_PER_KWH = 0.5; // $0.5 per kWh

    // Start the AC consumption timer
    public static void startAC() {
        startTime = System.currentTimeMillis();
    }

    // Calculate the electric bill and display the run time
    public static void calculateElectricBill() {
        long currentTime = System.currentTimeMillis();
        long timePassed = currentTime - startTime;  // time in milliseconds


        double timeInSeconds = timePassed / 1000.0;
        double numberOf10Seconds = timeInSeconds / 10.0;
        double totalConsumption = numberOf10Seconds * CONSUMPTION_PER_10_SECONDS;

        // Calculate
        double totalBill = totalConsumption * PRICE_PER_KWH;

        // Convert time passed to a readable format (hours, minutes, seconds)
        long timeInMillis = timePassed;
        long hours = (timeInMillis / (1000 * 60 * 60)) % 24;
        long minutes = (timeInMillis / (1000 * 60)) % 60;
        long seconds = (timeInMillis / 1000) % 60;


        System.out.printf("Total Electric Bill: $%.2f\n", totalBill);
        System.out.printf("Air conditioner has been running for %d hours, %d minutes, %d seconds.\n", hours, minutes, seconds);
        logBillToCSV(totalBill, hours, minutes, seconds);
    }

    // Write the electric bill and running time
    private static void logBillToCSV(double totalBill, long hours, long minutes, long seconds) {
        try (FileWriter fw = new FileWriter("air_conditioner_log.csv", true);
             PrintWriter writer = new PrintWriter(fw)) {
            // Write
            String timestamp = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
            writer.printf("Electric Bill: $%.2f, Time: %d hours, %d minutes, %d seconds, Timestamp: %s\n",
                    totalBill, hours, minutes, seconds, timestamp);
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}

