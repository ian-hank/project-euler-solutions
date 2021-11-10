/* 
BACKGROUND
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

QUESTION
What is the 10 001st prime number?
*/

import java.math.BigInteger;
import java.util.ArrayList;

public class P7 extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("104743");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for (int i = 1; primeList.size() != 10_001; i++) {

               int counter = 0;
               for (int num = i; num >= 1; num--) {
                   if (i % num == 0) {
                    counter += 1;
                   }
               }
               if (counter == 2) {
                primeList.add(i);
            }
        }
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = primeList.get(10_001 - 1);
        result[1] = endTime - startTime;
        return result;
    }
}