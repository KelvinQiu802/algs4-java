package chapter1.section1;

import edu.princeton.cs.algs4.*;

public class Exercise21 {
  public static void main(String[] args) {
    while (StdIn.hasNextLine()) {
      String paramsStr = StdIn.readLine();
      String[] params = paramsStr.split(" ");

      String name = params[0];
      int int1 = Integer.parseInt(params[1]);
      int int2 = Integer.parseInt(params[2]);
      double result = 1.0 * int1 / int2;

      StdOut.printf("%8s %8s %8s %8s\n", "Name", "Number1", "Number2", "Result");
      StdOut.printf("%8s %8d %8d %8.3f\n", name, int1, int2, result);
    }
  }
}
