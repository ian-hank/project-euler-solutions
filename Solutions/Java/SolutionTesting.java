import java.math.BigInteger;

public class SolutionTesting {
    //Ensures that the solutions output matches the actual answer
    public static void EnsureSolution(long[] solutionAnswer, BigInteger ACTUAL_ANSWER, int solutionNumber) {
        if (ACTUAL_ANSWER.equals(BigInteger.valueOf(solutionAnswer[0]))) {
            SolutionPassed(solutionAnswer, solutionNumber);
        } else {
            SolutionFailed(solutionAnswer, solutionNumber, ACTUAL_ANSWER);
        }
    }

    //Methods
    public static void SolutionPassed(long[] solutionAnswer, int solutionNumber) {
        System.out.printf("Solution [%d]: PASSED t:%.1fμs", solutionNumber, SystemTimeToMicroSeconds(solutionAnswer[1]));
    }

    public static void SolutionFailed(long[] solutionAnswer, int solutionNumber, BigInteger ACTUAL_ANSWER) {
        System.out.printf("Solution [%d]: !!!-FAILED-!!! Expected: %d Output: %d", solutionNumber, ACTUAL_ANSWER, solutionAnswer[0]);
    }

    public static double SystemTimeToMicroSeconds(long timeInNanoSeconds) {
        return timeInNanoSeconds /  1_000.0d;
    }
}