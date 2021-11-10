/* 
BACKGROUND
The prime factors of 13195 are 5, 7, 13 and 29.

QUESTION
What is the largest prime factor of the number 600851475143?
*/

import java.math.BigInteger;
import java.util.ArrayList;

public class P3 extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("6857");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        ArrayList<Long> numList = new ArrayList<Long>();
        long number = 600_851_475_143L; 
        
        for (long i = 1L; i <= number; i++) {
            if (number % i == 0) {
                numList.add(i);
                number /= i;
            }
        }
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = (long) numList.get( numList.size() - 1);
        result[1] = endTime - startTime;
        return result;
    }
}