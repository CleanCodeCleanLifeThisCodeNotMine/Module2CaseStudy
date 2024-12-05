package model;

public class AirConditioner {
    private Mode mode;
    private Temperature temperature;
    private FanSpeed fanSpeed;
    private Timer timer;

    public AirConditioner(Mode mode, Temperature temperature, FanSpeed fanSpeed, Timer timer) {
        this.mode = mode;
        this.temperature = temperature;
        this.fanSpeed = fanSpeed;
        this.timer = timer;
    }

    // Getter and setter methods
    public Mode getMode() { return mode; }
    public void setMode(Mode mode) { this.mode = mode; }

    public Temperature getTemperature() { return temperature; }
    public void setTemperature(Temperature temperature) { this.temperature = temperature; }

    public FanSpeed getFanSpeed() { return fanSpeed; }
    public void setFanSpeed(FanSpeed fanSpeed) { this.fanSpeed = fanSpeed; }

    public Timer getTimer() { return timer; }
    public void setTimer(Timer timer) { this.timer = timer; }
}
