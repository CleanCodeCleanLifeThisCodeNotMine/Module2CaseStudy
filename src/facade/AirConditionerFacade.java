package facade;

import model.Mode;
import singleton.AirConditionerManager;
import model.AirConditioner;

public class AirConditionerFacade {
    private AirConditionerManager manager = AirConditionerManager.getInstance();

    public void turnOn() {
        // Bật điều hòa
    }

    public void turnOff() {
        // Tắt điều hòa
    }

    public void setTemperature(int temperature) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTemperature().setValue(temperature);
    }

    public void setMode(String mode) {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.setMode(Mode.valueOf(mode.toUpperCase()));
    }

    public void increaseTimer() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTimer().increase();
    }

    public void decreaseTimer() {
        AirConditioner airConditioner = manager.getAirConditioner();
        airConditioner.getTimer().decrease();
    }
}
