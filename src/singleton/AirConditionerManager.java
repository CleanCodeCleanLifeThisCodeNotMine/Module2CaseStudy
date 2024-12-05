package singleton;

import model.AirConditioner;
import factory.AirConditionerFactory;

public class AirConditionerManager {
    private static AirConditionerManager instance;
    private AirConditioner airConditioner;

    private AirConditionerManager() {
        this.airConditioner = AirConditionerFactory.createAirConditioner();
    }

    public static synchronized AirConditionerManager getInstance() {
        if (instance == null) {
            instance = new AirConditionerManager();
        }
        return instance;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }
}
