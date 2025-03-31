import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("✊✋✌️ Choose Rock, Paper, or Scissors: ");
        String userChoice = sc.nextLine();
        String computerChoice = choices[rand.nextInt(3)];

        System.out.println("🤖 Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("😐 It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            System.out.println("🎉 You win!");
        } else {
            System.out.println("💀 You lose!");
        }

        sc.close();
    }
}
