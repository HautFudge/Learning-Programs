import java.util.Scanner;

public class Shell {
  public static void main(String[] args) {
    double celsius;
    double fahrenheit;
    final double C_TO_F = 9.0 / 5.0;
    final int DIFF_IN_ZEROES = 32;
    Scanner in = new Scanner(System.in);

    System.out.println("Let's convert some temperatures to Celsius!");
    System.out.print("What is the temperature (in ˚C)? ");
    celsius = in.nextDouble();
    in.nextLine();

    fahrenheit = celsius * C_TO_F + DIFF_IN_ZEROES;
    System.out.print("Celsius temp: ");
    System.out.println(celsius);
    System.out.print("Celsius to Fahrenheit conversion: ");
    System.out.println(C_TO_F);
    System.out.print("Resolve difference between 0˚: ");
    System.out.println(DIFF_IN_ZEROES);
    System.out.print("Fahrenheit value: ");
    System.out.println(fahrenheit);
    //System.out.printf("%.1f ˚C = %.1f ˚F\n", celsius, fahrenheit);


  }
}
