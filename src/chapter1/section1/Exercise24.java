package chapter1.section1;

public class Exercise24 {
  public static void main(String[] args) {
    System.out.println(gcd(1111111, 1234567));
  }

  public static int gcd(int p, int q) {
    System.out.println("p: " + p + " q: " + q);
    if (q == 0)
      return p;
    int r = p % q;
    return gcd(q, r);
  }
}
