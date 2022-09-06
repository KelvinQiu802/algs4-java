package chapter1.section1;

public class Exercise15 {
  public static void main(String[] args) {
    int[] a = { 1, 1, 2, 2, 3, 3, 4, 4 };
    int[] result = histogram(a, 5);
    for (int num : result) {
      System.out.print(num);
    }
  }

  public static int[] histogram(int[] a, int M) {
    int[] result = new int[M];
    for (int i = 0; i < a.length; i++) {
      if (a[i] < M) {
        result[a[i]]++;
      }
    }
    return result;
  }
}
