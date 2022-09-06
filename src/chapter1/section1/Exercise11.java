package chapter1.section1;

public class Exercise11 {
  public static void main(String[] args) {
    boolean[][] matrix = new boolean[9][9];
    matrix[0][0] = true;
    matrix[0][8] = true;
    matrix[8][0] = true;
    matrix[8][8] = true;

    printMatrix(matrix);
  }

  public static void printMatrix(boolean[][] matrix) {
    for (boolean[] row : matrix) {
      for (boolean item : row) {
        if (item) {
          System.out.print('*');
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}
