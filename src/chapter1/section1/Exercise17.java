package chapter1.section1;

public class Exercise17 {
  public static void main(String[] args) {
    System.out.println(exR2(5));
  }

  public static String exR2(int n) {
    if (n <= 0)
      return "";
    String s = exR2(n - 3) + n + exR2(n - 2) + n;
    return s;
  }
}
