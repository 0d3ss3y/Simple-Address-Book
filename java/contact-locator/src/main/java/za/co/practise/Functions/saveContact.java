package za.co.practise.Functions;

import java.util.Scanner;
import za.co.practise.contact;

public class saveContact {
    private static final Scanner scanner = new Scanner(System.in);

    public saveContact() {
        String contactName = getContactName();
        String contactNumber = getContactNumber();

        //System.out.println("\n"+contactName + " " + contactNumber);

        if (contactName != null && !contact.contactDetails.containsKey(contactName)) {
            contact.contactDetails.put(contactName,contactNumber);
            System.out.println("Successfully Saved");
        } else if (contact.contactDetails.containsKey(contactName) || contact.contactDetails.containsValue(contactNumber)) {
            System.out.println("Contact already exists");
        } else{
            System.out.println("Error Saving contact.");
        }
    }

    private String getContactNumber() {
        System.out.print("Enter your country code: +");
        String country_code = "+("+scanner.nextLine()+")";
        System.out.print("Enter your phone number: ");
        String unique_number= scanner.nextLine();
        return "%s%s".formatted(country_code, unique_number);
    }

    private String getContactName() {
        try {
            System.out.print("\nEnter Contact Name: ");
            String name = scanner.nextLine();
            Boolean nameCheck = validateName(name);

            if (!nameCheck){
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
