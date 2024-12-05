package model;

public class Temperature {
    private int value;

    public Temperature(int value) {
        this.value = value;
    }

    // Add this setter method to allow updating the temperature
    public void setValue(int value) {
        this.value = value;
    }

    // Getter method for the temperature value
    public int getValue() {
        return value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }
}
