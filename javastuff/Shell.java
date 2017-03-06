import java.util.Scanner;

public class Shell {

  public static void zool(int value, String pet, String street) {
      System.out.printf("Hi, I am %d.\n", value);
      System.out.print("My first pet was " + pet);
      System.out.println(", and I grew up on " + street + " street.");
  }
  public static void main(String[] args) {
    zool(11,"Max","Fonville");
  }
}
