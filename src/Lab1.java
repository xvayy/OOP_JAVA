import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних для першої функції
        System.out.println("Табуляція of y = sin(x) + cos(x):");
        System.out.print("Введіть початок: ");
        double start1 = scanner.nextDouble();
        System.out.print("Введіть кінець: ");
        double end1 = scanner.nextDouble();
        System.out.print("Введіть крок: ");
        double step1 = scanner.nextDouble();
        tabulateFirstFunction(start1, end1, step1);

        // Введення даних для другої функції
        System.out.println("\nТабуляція другої функції:");
        System.out.print("Введіть початок: ");
        double start2 = scanner.nextDouble();
        System.out.print("Введіть кінець: ");
        double end2 = scanner.nextDouble();
        System.out.print("Введіть крок: ");
        double step2 = scanner.nextDouble();
        tabulateSecondFunction(start2, end2, step2);

        // Введення даних для роботи з масивом
        System.out.print("\nВведіть розмір масиву: ");
        int size = scanner.nextInt();
        implementArray(size);

        scanner.close();
    }

    public static void tabulateFirstFunction(double start, double end, double step) {
        System.out.println("Табуляція y = sin(x) + cos(x):");
        for (double x = start; x <= end; x += step) {
            double y = Math.sin(x) + Math.cos(x);
            System.out.printf("x = %.1f, y = %.5f%n", x, y);
        }
    }

    public static void tabulateSecondFunction(double start, double end, double step) {
        System.out.println("\nТабуляція другої функції:");
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

    public static void implementArray(int size) {
        int[][] A = new int[size][size];
        fillArray(A, size);
        printArray(A, size);
        int positiveCount =  countPositiveAboveDiagonal(A, size);
        long factorial = calculateFactorial(positiveCount);
        System.out.println("\nКількість додатних елементів над головною діагоналлю: " + positiveCount);
        System.out.println("Факторіал кількості додатних елементів: " + factorial);
    }

    public static void fillArray(int[][] A, int N) {
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt(11) - 5; // Випадкові числа від -10 до 10
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
        System.out.print("Додатні числа: ");
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i][j] > 0) {
                    System.out.print(A[i][j] + ", ");
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
