import java.util.Scanner;

public class InputHelper {

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean validInput = false;
        boolean result = false;

        do {
            System.out.print(prompt + " [Y/N]: "); // Append [Y/N] to the prompt
            if (pipe.hasNext()) { // Check if there's input available
                String input = pipe.nextLine().trim(); // Read the input and trim any surrounding whitespace
                if (input.equalsIgnoreCase("Y")) {
                    result = true;
                    validInput = true; // Valid "yes" input received
                } else if (input.equalsIgnoreCase("N")) {
                    result = false;
                    validInput = true; // Valid "no" input received
                } else {
                    System.out.println("Invalid input: \"" + input + "\". Please enter 'Y' or 'N'.");
                }
            }
        } while (!validInput);

        return result;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean userResponse = getYNConfirm(console, "Do you want to continue?");
        System.out.println("You entered: " + (userResponse ? "Yes" : "No"));
    }
}
