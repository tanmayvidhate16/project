import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game options
        String[] options = {"Rock", "Paper", "Scissors"};
        
        // Welcome message
        System.out.println("Welcome to Rock-Paper-Scissors!");
        
        while (true) {
            // Ask the user for their choice
            System.out.println("Enter Rock, Paper, or Scissors (or 'quit' to exit): ");
            String userChoice = scanner.nextLine().trim();

            // Check if user wants to quit
            if (userChoice.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate user input
            if (!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper") && !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Get computer's choice
            int computerIndex = random.nextInt(3);
            String computerChoice = options[computerIndex];
            
            // Display choices
            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);
            
            // Determine the winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                    (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                    (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}
