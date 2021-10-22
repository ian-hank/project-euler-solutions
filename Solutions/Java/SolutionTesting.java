public class SolutionTesting {
    //Ensures that the solutions output matches the proper answer
    public static void EnsureSolution(long[] solutionAnswer, long ACTUAL_ANSWER, int solutionNumber) {
        if (solutionAnswer[0] == ACTUAL_ANSWER) {
            System.out.printf("Solution %d: PASSED t:%dns", solutionNumber, solutionAnswer[1]);
        } else {
            System.out.printf("Solution %d: !!!-FAILED-!!! Expected: %d Output: %d", solutionNumber, ACTUAL_ANSWER, solutionAnswer);
        }
    }
}