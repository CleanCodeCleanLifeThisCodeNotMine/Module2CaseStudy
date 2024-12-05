package facade;

import singleton.AirConditionerManager;
import model.AirConditioner;
import model.FanSpeed;
import model.Mode;
import model.Temperature;
import model.Timer;

public class AirConditionerFacade {
    private AirConditionerManager manager = AirConditionerManager.getInstance();

    // Bật điều hòa
    public void turnOn() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.togglePower();
        System.out.println("Air conditioner turned ON");
    }

    // Tắt điều hòa
    public void turnOff() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.togglePower();
        System.out.println("Air conditioner turned OFF");
    }

    // Đặt nhiệt độ
    public void setTemperature(int temperature) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTemperature().setValue(temperature);
        System.out.println("Temperature set to " + temperature + "°C");
    }

    // Đặt chế độ (nóng/lạnh)
    public void setMode(String mode) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.setMode(Mode.valueOf(mode.toUpperCase()));
        System.out.println("Mode set to " + mode);
    }

    // Đặt tốc độ quạt
    public void setFanSpeed(FanSpeed fanSpeed) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.setFanSpeed(fanSpeed);
        System.out.println("Fan speed set to " + fanSpeed);
    }

    // Tăng giờ hẹn
    public void increaseTimer() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTimer().increase();
        System.out.println("Timer increased by 30 minutes");
    }

    // Giảm giờ hẹn
    public void decreaseTimer() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTimer().decrease();
        System.out.println("Timer decreased by 30 minutes");
    }

    // Hiển thị trạng thái điều hòa
    public void displayStatus() {
        AirConditioner airConditioner = manager.getAirConditioner();
        System.out.println(airConditioner.getStatus());
    }
}
