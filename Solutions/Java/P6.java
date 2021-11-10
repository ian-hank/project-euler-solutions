/* 
BACKGROUND
The sum of the squares of the first ten natural numbers is, 
1^2 + 2^2 +...+ 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 +...+ 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
3025 - 385 = 2640

QUESTION
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

import java.math.BigInteger;

public class P6 extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("25164150");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        int squareSum = 0;
        int sumSquare = 0;
        int squareDifference = 0;

        for (int i = 1; i <= 100; i++) {
            squareSum += Math.pow(i, 2);
            sumSquare += i;
        }
        squareDifference = (int)Math.pow(sumSquare, 2) - (squareSum);
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = squareDifference;
        result[1] = endTime - startTime;
        return result;
    }
}
