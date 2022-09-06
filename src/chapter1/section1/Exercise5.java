package chapter1.section1;

public class Exercise5 {
  public static void main(String[] args) {
    double a = 0.5;
    double b = 1.7;

    if (isBetween(a) && isBetween(b)) {
      System.out.println("True!");
    } else {
      System.out.println("False!");
    }
  }

  public static boolean isBetween(double num) {
    if (num > 0 && num < 1) {
      return true;
    }
    return false;
  }
}
