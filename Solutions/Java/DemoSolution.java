/* 
BACKGROUND
background info goes here

QUESTION
main question goes here
*/

import java.math.BigInteger;

public class DemoSolution extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("-1");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = -1; //ASNWER GOES HERE
        result[1] = endTime - startTime;
        return result;
    }
}