package chapter1.section1;

public class Exercise3 {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    isEqual(a, b, c);
  }

  public static void isEqual(int a, int b, int c) {
    if (a == b && b == c)
      System.out.println("Equal!");
    else
      System.out.println("Not Equal!");
  }
}
