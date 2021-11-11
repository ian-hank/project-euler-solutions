/* 
BACKGROUND
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
a^2 + b^2 = c^2

For example, 32 + 42 = 9 + 16 = 25 = 52.

QUESTION
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

import java.math.BigInteger;

public class P9 extends SolutionTesting {
    //The actual solution to the problem
    final static BigInteger ACTUAL_ANSWER = new BigInteger("31875000");
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        int sumOfThree = 0;
        long productOfThree = 0;
        int firstNum, secondNum, totalSum;
        
        for (int i = 1; i <= 375; i++) {
            for (int j = i + 1; j <= 400; j++) {
                firstNum = (int) Math.pow(i,2);
                secondNum = (int) Math.pow(j, 2);
                totalSum = firstNum + secondNum;

                double totalSumSquared = Math.sqrt(totalSum);
                 
                sumOfThree = i + j + (int) totalSumSquared;

                if (totalSumSquared - Math.floor(totalSumSquared) == 0 && sumOfThree == 1000) {
                    productOfThree = i * j * (int) totalSumSquared;
                    break;
                } else {
                    continue;
                }
            }
        }
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = productOfThree; //ASNWER GOES HERE
        result[1] = endTime - startTime;
        return result;
    }
}