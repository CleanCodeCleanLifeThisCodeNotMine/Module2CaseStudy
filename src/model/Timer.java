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
        }
    }

    public int getHours() {
        return hours;
    }
}
