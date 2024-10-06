public class Square extends Shape {
    private double a; // Довжина сторони квадрата

    public Square(double a) {
        this.a = a;
    }

    // Реалізація методу для обчислення площі
    @Override
    public double getArea() {
        return a * a;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    // Метод для обчислення діагоналі
    public double getDiagonal() {
        return Math.sqrt(2) * a;
    }
}

// Реалізація за допомогою інтерфейсу
/*public class Square implements Shape {
    private double a; // Довжина сторони квадрата

    public Square(double a) {
        this.a = a;
    }

    // Реалізація методу для обчислення площі
    @Override
    public double getArea() {
        return a * a;
    }
}*/