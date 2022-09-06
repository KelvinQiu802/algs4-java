package chapter1.section1;

public class Exercise9 {
  public static void main(String[] args) {
    System.out.println(toBinaryString(5));
    System.out.println(toBinaryString(10));
    System.out.println(toBinaryString(100));
  }

  public static String toBinaryString(int num) {
    String result = "";
    while (num > 0) {
      result = num % 2 + result;
      num /= 2;
    }
    return result;
  }
}
