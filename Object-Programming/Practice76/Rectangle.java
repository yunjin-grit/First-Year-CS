class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int x, int y, int length, int width) {
        super(x, y, "사각형");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + ", 가로: " + length + ", 세로: " + width + ", 면적: " + String.format("%.2f", calcArea());
    }
}