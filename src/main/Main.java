package main;

import facade.AirConditionerFacade;
import model.FanSpeed;
import model.Mode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirConditionerFacade facade = new AirConditionerFacade();

        // Hỏi người dùng có muốn bật điều hòa không
        System.out.print("Do you want to turn on the air conditioner? (ON/OFF): ");
        String input = scanner.nextLine().trim();

        // Kiểm tra đầu vào, bật điều hòa nếu người dùng nhập "ON"
        if (input.equalsIgnoreCase("ON")) {
            facade.turnOn();
            // Tiếp tục chương trình nếu điều hòa đã bật
            facade.displayStatus();
        } else {
            System.out.println("Air conditioner is now OFF");
            return;  // Nếu không bật, kết thúc chương trình
        }

        // Thực hiện các hành động khác để ghi log
        facade.setTemperature(22);
        facade.setMode("cool");
        facade.setFanSpeed(FanSpeed.MEDIUM);
        facade.increaseTimer();
    }
}
