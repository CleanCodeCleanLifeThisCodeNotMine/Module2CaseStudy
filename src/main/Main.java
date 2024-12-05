package main;

import facade.AirConditionerFacade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirConditionerFacade facade = new AirConditionerFacade();

        System.out.print("Do you want to turn on the air conditioner? (ON/OFF): ");
        String input = scanner.nextLine().trim();

        // Kiểm tra đầu vào, bật điều hòa nếu người dùng nhập "ON"
        if (input.equalsIgnoreCase("ON")) {
            facade.turnOn();
            facade.displayStatus();
        } else {
            System.out.println("Air conditioner is OFF. Exiting program...");
            return;
        }

    }
}
