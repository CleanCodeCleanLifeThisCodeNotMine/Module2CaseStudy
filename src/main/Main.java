package main;

import facade.AirConditionerFacade;
import model.FanSpeed;
import model.Mode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirConditionerFacade facade = new AirConditionerFacade();

        // Start by asking if the user wants to turn on the air conditioner
        System.out.print("Do you want to turn on the air conditioner? (ON/OFF): ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("ON")) {
            facade.turnOn();
        } else {
            System.out.println("Air conditioner is OFF. Exiting program...");
            System.exit(0);
        }

        // loop
        while (true) {
            System.out.println("\nEnter a command:");
            System.out.println("1. Turn OFF the air conditioner");
            System.out.println("2. Set temperature (e.g., 22)");
            System.out.println("3. Set mode (cool/heat)");
            System.out.println("4. Set fan speed (e.g., low, medium, high)");
            System.out.println("5. Increase timer (+30 minutes)");
            System.out.println("6. Decrease timer (-30 minutes)");
            System.out.println("7. Display status");
            System.out.println("8. Exit");

            System.out.print("\nChoose an option (1-8): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    facade.turnOff();
                    break;
                case "2":
                    System.out.print("Enter desired temperature: ");
                    int temperature = Integer.parseInt(scanner.nextLine().trim());
                    facade.setTemperature(temperature);
                    break;
                case "3":
                    System.out.println("Select mode:");
                    System.out.println("1. Cool");
                    System.out.println("2. Heat");
                    System.out.print("Choose (1 or 2): ");
                    String modeChoice = scanner.nextLine().trim();
                    if (modeChoice.equals("1")) {
                        facade.setMode("cool");
                    } else if (modeChoice.equals("2")) {
                        facade.setMode("heat");
                    } else {
                        System.out.println("Invalid mode choice. Please select 1 for cool or 2 for heat.");
                    }
                    break;
                case "4":
                    System.out.print("Enter fan speed (low/medium/high): ");
                    String fanSpeed = scanner.nextLine().trim();
                    facade.setFanSpeed(FanSpeed.valueOf(fanSpeed.toUpperCase()));
                    break;
                case "5":
                    facade.increaseTimer();
                    break;
                case "6":
                    facade.decreaseTimer();
                    break;
                case "7":
                    facade.displayStatus();
                    break;
                case "8":
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
