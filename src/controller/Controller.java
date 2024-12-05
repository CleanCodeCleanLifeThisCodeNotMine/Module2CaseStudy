package controller;

import facade.AirConditionerFacade;
import model.FanSpeed;

import java.util.Scanner;

public class Controller {
    private AirConditionerFacade facade;
    private Scanner scanner;

    public Controller() {
        facade = new AirConditionerFacade();
        scanner = new Scanner(System.in);
    }

    public void start() {
        // Start by asking if the user wants to turn on the air conditioner
        System.out.print("Do you want to turn on the air conditioner? (ON/OFF): ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("ON")) {
            facade.turnOn();
        } else {
            System.out.println("Air conditioner is OFF. Exiting program...");
            System.exit(0);
        }

        // Loop for user commands
        while (true) {
            System.out.println("\nEnter a command:");
            System.out.println("1. Turn OFF the air conditioner");
            System.out.println("2. Set temperature (e.g., 22)");
            System.out.println("3. Set mode (1. cool, 2. heat)");
            System.out.println("4. Set fan speed (1. low, 2. medium, 3. high)");
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
                    System.out.println("Select fan speed:");
                    System.out.println("1. Low");
                    System.out.println("2. Medium");
                    System.out.println("3. High");
                    System.out.print("Choose (1, 2, or 3): ");
                    String fanSpeedChoice = scanner.nextLine().trim();
                    switch (fanSpeedChoice) {
                        case "1":
                            facade.setFanSpeed(FanSpeed.LOW);
                            break;
                        case "2":
                            facade.setFanSpeed(FanSpeed.MEDIUM);
                            break;
                        case "3":
                            facade.setFanSpeed(FanSpeed.HIGH);
                            break;
                        default:
                            System.out.println("Invalid fan speed choice. Please select 1 for low, 2 for medium, or 3 for high.");
                    }
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
