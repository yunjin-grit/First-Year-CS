//컴퓨터학과 20250492 이윤진
class Triangle extends Shape {
	private int base;
    private int height;

    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public int getBase() { return base; }
    public int getHeight() { return height; }

    @Override
    public double calcArea() {
        return base * height / 2.0;
    }

    @Override
    public String toString() {
        return "타입: 삼각형\n중심좌표: " + positionStr() +
               ", 밑변: " + base + ", 높이: " + height +
               ", 면적: " + String.format("%.2f", calcArea());
    }
}

