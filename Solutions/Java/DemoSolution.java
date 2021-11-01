/* 
BACKGROUND
background info goes here

QUESTION
main question goes here
*/

public class DemoSolution extends SolutionTesting {
    //The actual solution to the problem
    final static int ACTUAL_ANSWER = -1;
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
        //Answer goes in result[0]
        result[1] = endTime - startTime;
        return result;
    }
}