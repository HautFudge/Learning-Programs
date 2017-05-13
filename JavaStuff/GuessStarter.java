import java.util.Scanner;
import java.util.Random;

public class GuessStarter {
  public static void main(String[] args) {
    Random random = new Random();
    int theNum = random.nextInt(10) + 1;
    Scanner in = new Scanner(System.in);

    System.out.print("I'm thinking of a number from 1 to 10; what is it? ");
    int input = in.nextInt();

    System.out.printf("You guessed %d. The correct number is %d.\n",
    input, theNum);
  }
}
