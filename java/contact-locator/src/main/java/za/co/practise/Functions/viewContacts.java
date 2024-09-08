package za.co.practise.Functions;

import za.co.practise.contact;

import java.util.Map;

public class viewContacts {

    public viewContacts(){
        if (contact.contactDetails.isEmpty()){
            System.out.println("No contact details found");
        }else {
            System.out.println("Contact List:");
            int count = 1;
            for (Map.Entry<String,String> entry : contact.contactDetails.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("["+count+"] "+key+" : "+value);
                count++;
            }
        }


    }
}
