package za.co.practise.Functions;

import java.util.Scanner;
import za.co.practise.contact;

public class deleteContact {
    private final Scanner sc = new Scanner(System.in);

    public deleteContact(){
        getContact();
    }

    private void getContact() {
        System.out.print("Enter contact name: ");
        String name = sc.nextLine();

        if (name.isEmpty() || name.equalsIgnoreCase("null")){
            System.out.println("Contact name is empty");
        } else if (contact.contactDetails.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            if (contact.contactDetails.containsKey(name)){
                contact.contactDetails.remove(name);
                System.out.println("Contact has been successfully removed");
            } else {
                System.out.println("Contact "+name+" not found");
            }
        }
    }
}
