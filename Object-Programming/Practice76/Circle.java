class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y, "원");
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", 반지름: " + radius + ", 면적: " + String.format("%.1f", calcArea());
    }
}