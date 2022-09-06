package chapter1.section1;

public class Exercise22 {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int result = rank(3, a, 0, a.length - 1, 1);
    System.out.println(result);
  }

  public static int rank(int key, int[] a, int lo, int hi, int depth) {
    String indent = "    ".repeat(depth);
    System.out.println(indent + lo + "~" + hi);

    if (lo > hi)
      return -1;
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid])
      return rank(key, a, lo, mid - 1, depth + 1);
    else if (key > a[mid])
      return rank(key, a, mid + 1, hi, depth + 1);
    else
      return mid;
  }
}
