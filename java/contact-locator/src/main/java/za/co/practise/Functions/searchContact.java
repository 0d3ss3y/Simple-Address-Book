package za.co.practise.Functions;

import za.co.practise.contact;

import java.util.Map;
import java.util.Scanner;

import static za.co.practise.GUI.TUI.searchMenu;
import static za.co.practise.GUI.TUI.searchMenuOptions;

public class searchContact {
    private final Scanner scanner = new Scanner(System.in);

    public searchContact(){
        searchMenu();
        String opt = scanner.nextLine();

        try {
            int idx = Integer.parseInt(opt);

            if (idx == 0 || idx < searchMenuOptions.length || idx > searchMenuOptions.length){
                throw new NumberFormatException();
            } else {
                switch (idx){
                    case 1 -> searchByName();
                    case 2 -> searchByNumber();
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Please enter a valid option!");
        }
    }

    private void searchByNumber() {
        System.out.print("Please enter the contact number of the contact: ");
        String number = scanner.nextLine();

        if (contact.contactDetails.isEmpty()){
            System.out.println("Contact details are empty!");
        } else if (contact.contactDetails.containsValue(number)) {
            for (Map.Entry<String,String> entry : contact.contactDetails.entrySet()){
                if (entry.getValue().equals(number)){
                    System.out.println("Contact number " + entry.getKey() + " belongs to " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Contact not found!");
        }
    }

    private void searchByName() {
        System.out.print("Please enter the name of the contact: ");
        String name = scanner.nextLine();

        if (contact.contactDetails.isEmpty()){
            System.out.println("Contact details are empty!");
        } else if (contact.contactDetails.containsKey(name)) {
            String contactNumber = contact.contactDetails.get(name);
            System.out.println("Contact number " + contactNumber + " is found!");
        } else {
            System.out.println("Contact not found!");
        }
    }
}
