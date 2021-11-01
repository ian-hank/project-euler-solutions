/* 
BACKGROUND
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

QUESTION
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

import java.util.ArrayList;

public class P5 extends SolutionTesting {
    //The actual solution to the problem
    final static int ACTUAL_ANSWER = 232792560;
    public static void main(String[] args) {
        EnsureSolution(Solution1(), ACTUAL_ANSWER, 1);
    }

    //SOLUTIONS
    public static long[] Solution1() {
        long[] result = new long[2];
        long startTime = System.nanoTime();

        //START SOLUTION
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = 1; i != -1; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0 && i != -1) {
                    if (j == 20) {
                        numList.add(i);
                    }
                    continue;
                } else {
                    break;
                }
            }
        }
        //END SOLUTION

        long endTime = System.nanoTime();
        result[0] = numList.get(0);
        result[1] = endTime - startTime;
        return result;
    }
}