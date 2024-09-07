package za.co.practise;

import java.util.Scanner;

import static za.co.practise.TUI.displayMenu;
import static za.co.practise.TUI.mainMenuOptions;

public class contact {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Contact List");
        displayMenu();
        String option = scanner.nextLine();
        Boolean optCheck = validateOption(option);
    }

    private static Boolean validateOption(String option) {
        int optlistlength = mainMenuOptions.length;

        if (Integer.valueOf(option))

    }


}