package za.co.practise;

public interface TUI {
     final String[] mainMenuOptions = {
            "Save Contact",
            "Delete Contact",
            "Search"
    };

    static void displayMenu(){
        System.out.println("\nMain Menu:");

        for (int i = 0; i < mainMenuOptions.length; i++) {
            System.out.print("[");
            System.out.print(Integer.toString(i+1));
            System.out.print("] ");
            System.out.println(mainMenuOptions[i]);
        }

        System.out.println("Please choose an option from the above: ");
    }
}
