import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock",
                        "Paper",
                        "Scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Yes";

        do{
            System.out.print("Enter your choice (Rock,paper,scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice....");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie.");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");

            }
            else {
                System.out.println("You loose");
            }

            System.out.print("Do you want to play again(Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();

        }
        while (playAgain.equals("yes"));

        System.out.println("Thanks for playing.");



        scanner.close();
    }
}
