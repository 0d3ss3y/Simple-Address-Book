package za.co.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static za.co.practise.GUI.TUI.*;

public class contact {
    private static final Scanner scanner = new Scanner(System.in);
    public Map<String, Integer> contactDetails = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Contact List");
        displayMenu();
        String option = scanner.nextLine();
        Boolean optCheck = validateOption(option);
    }

    private static Boolean validateOption(String option) {
        int optlistlength = mainMenuOptions.length;
        int option_idx;

        try {
            option_idx = Integer.parseInt(option);

            if (option_idx<optlistlength || option_idx>optlistlength){
                throw new NumberFormatException();
            } else if (option_idx == 4) {
                System.exit(1);
            } else {
                switch (option_idx){
                    case 1 -> {}
                    case 2 -> {}
                    case 3 -> {}
                }
            }

        }catch (NumberFormatException e){
            System.out.println("~Enter the item index~");
        }

        return null;
    }


}