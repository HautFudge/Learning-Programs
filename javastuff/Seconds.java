import java.util.Scanner;

public class Seconds {
  public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  int input;
  int hours;
  int minutes;
  int seconds;
  final int SEC_IN_MIN = 60;
  final int SEC_IN_HOUR = SEC_IN_MIN * 60;

  System.out.println("Wanna convert some seconds into HH:mm:ss?");
  System.out.print("How many seconds? ");
  input = in.nextInt();

  hours = input / SEC_IN_HOUR;
  minutes = (input % SEC_IN_HOUR) / 60;
  seconds = (input % SEC_IN_HOUR) % 60;

  System.out.printf("%d seconds = %d hr(s), %d min(s), %d sec(s).\n",
  input, hours, minutes, seconds);
  }
}
