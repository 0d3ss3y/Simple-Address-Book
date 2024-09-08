package za.co.practise.Functions;

import java.util.Map;
import java.util.Scanner;
import za.co.practise.contact;

public class deleteContact {
    private Scanner sc = new Scanner(System.in);

    public deleteContact(){
        String[] details = getContactName();
    }

    private String[] getContactName() {
        System.out.print("Enter contact name: ");
        String name = sc.nextLine();

        if (name.isEmpty() || name.equalsIgnoreCase("null")){
            return null;
        } else {
            if (contact.contactDetails.containsKey(name)){
                String contactNumber = contact.contactDetails.get(name);
                return new String[]{name,contactNumber};
            } else {
                System.out.println("Contact "+name+" not found");
            }
        }

        return null;
    }
}
