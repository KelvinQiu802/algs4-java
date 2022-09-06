package chapter1.section1;

public class Exercise14 {
  public static void main(String[] args) {
    System.out.println(log(15)); // 3
  }

  public static int log(int num) {
    int result = 0;
    while (num > 0) {
      result++;
      num /= 2;
    }
    return result - 1;
  }
}
