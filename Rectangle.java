public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
