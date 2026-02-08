class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int x, int y, int base, int height) {
        super(x, y, "삼각형");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return base * height / 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", 밑변: " + base + ", 높이: " + height + ", 면적: " + String.format("%.2f", calcArea());
    }
}