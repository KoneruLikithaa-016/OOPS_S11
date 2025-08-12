package teacher;
import java.util.Scanner;

public class login {
   
    private String storedUsername;

    // Constructor
    public login(String storedUsername) {
        this.storedUsername = storedUsername;
    }

    // Method to validate username
    public void validateLogin(String inputUsername) {
        System.out.println("\n--- Login Validation ---");

        if (storedUsername.equals(inputUsername)) {
            System.out.println("✔ equals(): Usernames match by content.");
        } else {
            System.out.println("✘ equals(): Usernames do not match by content.");
        }

        if (storedUsername == inputUsername) {
            System.out.println("✔ == : Usernames refer to the SAME object.");
        } else {
            System.out.println("✘ == : Usernames refer to DIFFERENT objects.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulated stored username (from database)
        String dbUsername = "admin";

        // Create login object
        login system = new login(dbUsername);

        // Input from user
        System.out.print("Enter your username: ");
        String userInput = scanner.nextLine();

        // Validate entered username
        system.validateLogin(userInput);
    }
}



