abstract class Shape {
    protected int x;
    protected int y;
    protected String type;

    public Shape(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    // 추상 메소드: 면적 계산
    public abstract double calcArea();

    @Override
    public String toString() {
        String result = "타입: " + type + "\n중심좌표: (" + x + ", " + y + ")";
        return result;
    }
}