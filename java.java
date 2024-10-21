import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        int index = rand.nextInt(choices.length);
        return choices[index];
    }

    public static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rock, paper, or scissors: ");
        String userInput = scanner.nextLine().toLowerCase();

        // Validate input
        while (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
            System.out.println("Invalid choice. Try again.");
            System.out.print("Enter rock, paper, or scissors: ");
            userInput = scanner.nextLine().toLowerCase();
        }
        return userInput;
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "You win!";
        }

        return "You lose!";
    }

    public static void playGame() {
        System.out.println("Welcome to Rock Paper Scissors!");
        String userChoice = getUserChoice();
        String computerChoice = getComputerChoice();

        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);

        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);
    }

    public static void main(String[] args) {
        playGame();
    }
}
