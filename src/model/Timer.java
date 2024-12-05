package model;

public class Timer {
    private int hours;

    public Timer(int hours) {
        this.hours = hours;
    }

    public void increase() {
        this.hours += 30;
    }

    public void decrease() {
        if (this.hours > 30) {
            this.hours -= 30;
        } else {
            this.hours = 0; //Hopefully fix the decrease bug
        }
    }

    public int getHours() {
        return hours;
    }
}
