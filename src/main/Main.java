package main;

import facade.AirConditionerFacade;
import utils.Logger;
import model.Log;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AirConditionerFacade facade = new AirConditionerFacade();
        List<Log> logs = new ArrayList<>();

        // Bật điều hòa
        facade.turnOn();
        logs.add(new Log("Turned on air conditioner", "2024-12-05 08:00"));

        // Chỉnh nhiệt độ
        facade.setTemperature(22);
        logs.add(new Log("Set temperature to 22", "2024-12-05 08:05"));

        // Chế độ lạnh
        facade.setMode("cool");
        logs.add(new Log("Set mode to COOL", "2024-12-05 08:06"));

        // Tăng giờ hẹn
        facade.increaseTimer();
        logs.add(new Log("Increased timer by 30 minutes", "2024-12-05 08:10"));

        // Xuất log ra file CSV
        Logger.logToCSV(logs, "air_conditioner_log.csv");
    }
}
