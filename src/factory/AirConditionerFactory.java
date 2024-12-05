package factory;

import model.AirConditioner;
import model.Mode;
import model.FanSpeed;
import model.Temperature;
import model.Timer;

public class AirConditionerFactory {
    public static AirConditioner createAirConditioner() {
        return new AirConditioner(Mode.COOL, new Temperature(24), FanSpeed.MEDIUM, new Timer(0));
    }
}
