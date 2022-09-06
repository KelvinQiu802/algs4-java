package chapter1.section1;

public interface Exercise19 {
  public static void main(String[] args) {
    System.out.println(F(10));
  }

  public static long F(int N) {
    if (N == 0)
      return 0;
    if (N == 1)
      return 1;
    return F(N - 1) + F(N - 2);
  }

}
