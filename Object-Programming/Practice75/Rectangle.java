//컴퓨터학과 20250492 이윤진
class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int x, int y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "타입: 사각형\n중심좌표: " + positionStr() +
               ", 가로: " + length + ", 세로: " + width +
               ", 면적: " + String.format("%.2f", calcArea());
    }
}