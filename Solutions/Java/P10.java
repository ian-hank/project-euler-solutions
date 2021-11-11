/* 
BACKGROUND
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

QUESTION
Find the sum of all the primes below two million.
*/

import java.math.BigInteger;
import java.util.ArrayList;

public class P10 extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("-1");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
        EnsureSolution(Solution2(), ACTUAL_ANSWER, 2);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        long totalSum = 0;
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 1; i <= 2_000_000; i++) {
            if (i % 2 != 0) {
                numList.add(i);
                System.out.println(i);
            }
        }
        for (int j = 0; j < numList.size(); j++) {
            int counter = 0;
            
            for (int k = j; k >= 1; k--) {
                if (j % k == 0) {
                    counter += 1;
                }
            }

            if (counter == 2) {
                    numList.remove(j);
           }
        }
        System.out.println(numList.toString());
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = totalSum; //ASNWER GOES HERE
        result[1] = endTime - startTime;
        return result;
    }

    public static long[] Solution2() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        long totalSum = 0;

        for (int i = 1; i <= 2_000_000; i++) {
            int counter = 0;
            if (i % 2 == 0) {
                break;
            }

            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                 counter += 1;
                }
            }
            if (counter == 2) {
             totalSum += i;
            }
            System.out.println(i);
        }
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = totalSum; //ASNWER GOES HERE
        result[1] = endTime - startTime;
        return result;
    }
}
