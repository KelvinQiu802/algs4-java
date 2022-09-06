package chapter1.section1;

public class Exercise13 {
  public static void main(String[] args) {
    int[][] matrix = getMatrix(3, 5);
    int[][] result = transposition(matrix);

    printMatrix(matrix);
    System.out.println();
    printMatrix(result);
  }

  public static int[][] getMatrix(int rows, int cols) {
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = i + j;
      }
    }
    return matrix;
  }

  public static int[][] transposition(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] result = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[j][i] = matrix[i][j];
      }
    }
    return result;
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] rows : matrix) {
      for (int item : rows) {
        System.out.print(item);
      }
      System.out.println();
    }
  }
}
