package main;

import controller.Controller;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        // Keep asking for the email until it is valid
        while (true) {
            System.out.print("Nhap email de nhan quang cao: ");
            email = scanner.nextLine().trim();

            if (isValidEmail(email)) {
                System.out.println("Ngon");
                break;
            } else {
                System.out.println("Nhap mail that di ban ei");
            }
        }

        // The Controller starts here
        Controller controller = new Controller();
        controller.start();
    }

    // Regex to check email format
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}
