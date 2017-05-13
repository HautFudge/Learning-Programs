import java.util.Scanner;

public class Moduli {
  public static void main(String[] args) {

    final int INCHES_PER_FOOT = 12;
    Scanner in = new Scanner(System.in);

    System.out.println("Let's convert some inches to feet!");
    System.out.print("How long (in inches) is your measurement? ");
    int input = in.nextInt();

    int feet = input / INCHES_PER_FOOT;
    int inches = input % INCHES_PER_FOOT;

    System.out.printf("%d inches is %d ft. %d in.\n", input, feet, inches);

    System.out.println("\n");
    for (int i = 0; i < 30; i++) {
      System.out.print("-");
    }
    System.out.print("\n");
    System.out.println("This is a separate project on type casts.");
    System.out.println("Let's convert centimeters to inches!");
    System.out.println("How many centimeters? ");
    int input2 = in.nextInt();

    final double CM_PER_INCH = 2.54;
    int inch = (int) (input2 / CM_PER_INCH);

    System.out.printf("%d cm = %d in\n", input2, inch);

  }
}
