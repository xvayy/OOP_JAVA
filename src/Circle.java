public class Circle extends Shape {
    private double r; // Радіус кола

    public Circle(double r) {
        this.r = r;
    }

    // Реалізація методу для обчислення площі
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    public double getCircumference() {
        return 2 * Math.PI * r;
    }

    // Метод для обчислення діаметра
    public double getDiameter() {
        return 2 * r;
    }
}

// Реалізація за допомогою інтерфейсу
/*public class Circle implements Shape {
    private double r; // Радіус кола

    public Circle(double r) {
        this.r = r;
    }

    // Реалізація методу для обчислення площі
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}*/