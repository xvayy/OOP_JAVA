import java.util.Random;
public class Lab1 {
    public static void main(String[] args) {
        tabulateFirstFunction();
        tabulateSecondFunction();
        handleArray();
    }

    public static void tabulateFirstFunction() {
        System.out.println("Tabulation of y = sin(x) + cos(x):");
        double start = -5.0;
        double end = 5.0;
        double step = 1.0;
        double x = start;

        while (x <= end) {
            double y = Math.sin(x) + Math.cos(x);
            System.out.printf("x = %.1f, y = %.5f%n", x, y);
            x += step;
        }
    }

    public static void tabulateSecondFunction() {
        System.out.println("\nTabulation of piecewise function:");
        double start = 0.0;
        double end = 2.0;
        double step = 0.2;
        double x = start;

        while (x <= end) {
            double y;
            if (x < 1.0) {
                y = 2.0 * Math.pow(x, 2.0) + 4.0;
            } else {
                y = 2.0 * Math.log(x) + x;
            }

            System.out.printf("x = %.1f, y = %.5f%n", x, y);
            x += step;
        }
    }

    public static void handleArray() {
        int N = 10;
        int[][] A = new int[N][N];

        fillArray(A, N);

        printArray(A, N);

        int positiveCount = countPositiveAboveDiagonal(A, N);

        long factorial = calculateFactorial(positiveCount);

        System.out.println("Factorial of the number of positive elements above the main diagonal: " + factorial);
    }

    public static void fillArray(int[][] A, int N) {
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt(21) - 10; // Випадкові числа від -10 до 10
            }
        }
    }

    public static void printArray(int[][] A, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d ", A[i][j]);
            }
            System.out.println();
        }
    }

    public static int countPositiveAboveDiagonal(int[][] A, int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
