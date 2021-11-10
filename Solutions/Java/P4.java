/* 
BACKGROUND
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

QUESTION
Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.math.BigInteger;

public class P4 extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("906609");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        long largestPali = 0;
        String product, revProduct = "";
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = String.valueOf(i * j);

                //Reversing the product
                for (int k = product.length() - 1; k >= 0; k--) {
                    revProduct += product.charAt(k);
                }
                if (revProduct.equals(product)) {
                    if ((i * j) > largestPali) {
                        largestPali = (i*j);
                    };
                } else {
                    revProduct = "";
                }
            }
        }
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = largestPali;
        result[1] = endTime - startTime;
        return result;
    }
}