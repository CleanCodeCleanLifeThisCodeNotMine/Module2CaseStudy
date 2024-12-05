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

        // Keep the program running in a loop, waiting for further user commands
        while (true) {
            System.out.println("\nEnter a command:");
            System.out.println("1. Turn OFF the air conditioner");
            System.out.println("2. Set temperature (e.g., 22)");
            System.out.println("3. Set mode (e.g., cool, heat)");
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
                    System.out.print("Enter mode (cool/heat): ");
                    String mode = scanner.nextLine().trim();
                    facade.setMode(mode);
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
                    System.exit(0);  // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
