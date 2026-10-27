package lab3;
import java.util.Random;

public class Q4 {
    public static void main(String[] args){
        Random random = new Random();

        int player1Dice1 = random.nextInt(6) + 1;
        int player1Dice2 = random.nextInt(6) + 1;

        int player2Dice1 = random.nextInt(6) + 1;
        int player2Dice2 = random.nextInt(6) + 1;

        int player1Score = player1Dice1 + player1Dice2;
        int player2Score = player2Dice1 + player2Dice2;

        System.out.println("Player 1 rolled: "
                + player1Dice1 + " and " + player1Dice2);
        System.out.println("Player 1 score: " + player1Score);

        System.out.println("Player 2 rolled: "
                + player2Dice1 + " and " + player2Dice2);
        System.out.println("Player 2 score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Draw!");
        }
    }
}
