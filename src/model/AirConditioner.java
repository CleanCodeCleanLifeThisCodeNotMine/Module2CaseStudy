package model;

public class AirConditioner {
    private Mode mode;
    private Temperature temperature;
    private FanSpeed fanSpeed;
    private Timer timer;
    private boolean isOn;  // Trạng thái bật/tắt

    public AirConditioner(Mode mode, Temperature temperature, FanSpeed fanSpeed, Timer timer) {
        this.mode = mode;
        this.temperature = temperature;
        this.fanSpeed = fanSpeed;
        this.timer = timer;
        this.isOn = false;  // Mặc định điều hòa tắt
    }

    // Getter and Setter methods
    public Mode getMode() { return mode; }
    public void setMode(Mode mode) { this.mode = mode; }

    public Temperature getTemperature() { return temperature; }
    public void setTemperature(Temperature temperature) { this.temperature = temperature; }

    public FanSpeed getFanSpeed() { return fanSpeed; }
    public void setFanSpeed(FanSpeed fanSpeed) { this.fanSpeed = fanSpeed; }

    public Timer getTimer() { return timer; }
    public void setTimer(Timer timer) { this.timer = timer; }

    public boolean isOn() {
        return isOn;
    }

    public void togglePower() {
        this.isOn = !this.isOn;
    }

    // Hiển thị trạng thái của điều hòa
    public String getStatus() {
        return "AirConditioner is " + (isOn ? "ON" : "OFF") +
                ", Mode: " + mode +
                ", Temperature: " + temperature.getValue() + "°C" +
                ", Fan Speed: " + fanSpeed +
                ", Timer: " + timer.getHours() + " minutes";
    }
}
