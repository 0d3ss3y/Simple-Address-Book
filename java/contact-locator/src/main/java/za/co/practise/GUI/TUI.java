package za.co.practise.GUI;

public interface TUI {
     final String[] mainMenuOptions = {
            "Save Contact",
            "Delete Contact",
            "Search",
             "Exit"
    };

    static void displayMenu(){
        System.out.println("\nMain Menu:");

        for (int i = 0; i < mainMenuOptions.length; i++) {
            System.out.print("[");
            System.out.print(Integer.toString(i+1));
            System.out.print("] ");
            System.out.println(mainMenuOptions[i]);
        }

        System.out.print("Enter an option (1-3) or 4 to exit: ");    }
}
