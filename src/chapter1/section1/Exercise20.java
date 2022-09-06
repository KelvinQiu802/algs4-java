package chapter1.section1;

public class Exercise20 {
  public static void main(String[] args) {
    System.out.println(factorialLog(10));
  }

  public static double factorialLog(int N) {
    if (N == 1)
      return 0;
    return factorialLog(N - 1) + Math.log(N);
  }
}
