package za.co.practise.Functions;

import java.util.Scanner;

public class saveContact {
    private static final Scanner scanner = new Scanner(System.in);

    public saveContact() {
        String contactName = getContactName();
    }

    private String getContactName() {
        try {
            System.out.print("Enter Contact Name: ");
            String name = scanner.nextLine();
            Boolean nameCheck = validateName(name);

            if (nameCheck){
                return name;
            }
        } catch (Exception e){
            System.out.println("Invalid Entry");
        }

        return null;
    }

    private Boolean validateName(String name) {
        return name.isEmpty() || name.equalsIgnoreCase("null");
    }
}
