package main;

import facade.AirConditionerFacade;
import model.FanSpeed;
import model.Mode;

public class Main {
    public static void main(String[] args) {
        AirConditionerFacade facade = new AirConditionerFacade();

        // Bật điều hòa
        facade.turnOn();

        // Đặt chế độ lạnh
        facade.setMode("cool");

        // Chỉnh nhiệt độ
        facade.setTemperature(22);

        // Đặt tốc độ quạt
        facade.setFanSpeed(FanSpeed.MEDIUM);

        // Tăng giờ hẹn
        facade.increaseTimer();

        // Hiển thị trạng thái điều hòa
        facade.displayStatus();

        // Tắt điều hòa
        facade.turnOff();
    }
}
