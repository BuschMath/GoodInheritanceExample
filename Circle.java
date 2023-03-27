public class Circle extends Shape {
    protected double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
