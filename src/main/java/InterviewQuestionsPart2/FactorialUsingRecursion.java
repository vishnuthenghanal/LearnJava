package InterviewQuestionsPart2;

public class FactorialUsingRecursion {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
