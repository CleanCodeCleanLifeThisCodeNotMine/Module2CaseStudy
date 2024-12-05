package facade;

import singleton.AirConditionerManager;
import model.AirConditioner;
import model.FanSpeed;
import model.Mode;
import util.Logger;
import model.Log;

public class AirConditionerFacade {
    private AirConditionerManager manager = AirConditionerManager.getInstance();

    // Bật điều hòa
    public void turnOn() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.togglePower();
        Log log = new Log("Air conditioner turned ON");
        Logger.logToCSV(log, "air_conditioner_log.csv");
    }

    // Tắt điều hòa
    public void turnOff() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.togglePower();
        Log log = new Log("Air conditioner turned OFF");
        Logger.logToCSV(log, "air_conditioner_log.csv");
    }

    // Đặt nhiệt độ
    public void setTemperature(int temperature) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTemperature().setValue(temperature);
        Log log = new Log("Temperature set to " + temperature + "°C");
        Logger.logToCSV(log, "air_conditioner_log.csv");
    }

    // Đặt chế độ (nóng/lạnh)
    public void setMode(String mode) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.setMode(Mode.valueOf(mode.toUpperCase()));
        Log log = new Log("Mode set to " + mode);
        Logger.logToCSV(log, "air_conditioner_log.csv");
    }

    // Đặt tốc độ quạt
    public void setFanSpeed(FanSpeed fanSpeed) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.setFanSpeed(fanSpeed);
        Log log = new Log("Fan speed set to " + fanSpeed);
        Logger.logToCSV(log, "air_conditioner_log.csv");
    }

    // Tăng giờ hẹn
    public void increaseTimer() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTimer().increase();
        Log log = new Log("Timer increased by 30 minutes");
        Logger.logToCSV(log, "air_conditioner_log.csv");
    }

    // Giảm giờ hẹn
    public void decreaseTimer() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTimer().decrease();
        Log log = new Log("Timer decreased by 30 minutes");
        Logger.logToCSV(log, "air_conditioner_log.csv");
    }

    // Hiển thị trạng thái điều hòa
    public void displayStatus() {
        AirConditioner airConditioner = manager.getAirConditioner();
        System.out.println(airConditioner.getStatus());
    }
}
