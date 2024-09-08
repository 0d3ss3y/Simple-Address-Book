package za.co.practise;

import za.co.practise.Functions.deleteContact;
import za.co.practise.Functions.saveContact;
import za.co.practise.Functions.searchContact;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static za.co.practise.GUI.TUI.*;

public class contact {
    private static final Scanner scanner = new Scanner(System.in);
    public static Map<String, String> contactDetails = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Contact List");
        validateOption();
    }

    private static void validateOption() {
        int optlistlength = mainMenuOptions.length;
        int option_idx = 0;

        while (true) {
            displayMenu();
            String option = scanner.nextLine();

            try {
                option_idx = Integer.parseInt(option);

                if (option_idx <= 0 || option_idx > optlistlength) {
                    System.out.println("Option doesn't exist");
                } else {
                    switch (option_idx) {
                        case 1 -> new saveContact();
                        case 2 -> new deleteContact();
                        case 3 -> new searchContact();
                        case 4 -> System.out.println("Option 4 selected - View Contact");
                        case 5 -> {
                            System.out.println("Exiting...");
                            scanner.close();
                            System.exit(1);}
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("~Enter a valid number~");
            }
        }
    }


}