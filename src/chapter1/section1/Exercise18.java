package chapter1.section1;

public class Exercise18 {
  public static void main(String[] args) {
    System.out.println(mystery(2, 5));
    System.out.println(mystery(3, 11));
    System.out.println(mystery2(2, 5));
    System.out.println(mystery2(3, 11));
  }

  public static int mystery(int a, int b) {
    if (b == 0)
      return 0;
    if (b % 2 == 0)
      return mystery(a + a, b / 2);
    return mystery(a + a, b / 2) + a;
  }

  public static int mystery2(int a, int b) {
    if (b == 0)
      return 1;
    if (b % 2 == 0)
      return mystery(a * a, b / 2);
    return mystery(a * a, b / 2) * a;
  }
}
