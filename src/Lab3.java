import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину сторони квадрата: ");
        double squareSide = scanner.nextDouble();
        Shape square = new Square(squareSide);
        System.out.println("Площа квадрата: " + square.getArea());

        System.out.print("Введіть радіус кола: ");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.println("Площа кола: " + circle.getArea());

        scanner.close();
    }
}
