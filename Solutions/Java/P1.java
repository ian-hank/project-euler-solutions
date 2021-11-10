/* 
BACKGROUND
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

QUESTION
Find the sum of all the multiples of 3 or 5 below 1000.
*/

import java.math.BigInteger;

public class P1 extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("233168");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        int totalSum = 0;

        for(int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                totalSum += i;
            }
        }
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = totalSum;
        result[1] = endTime - startTime;
        return result;
    }
}