//컴퓨터학과 20250492 이윤진
public class Shape {
	private int x;
	private int y;
	
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	
	public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	public String positionStr() {
        return "(" + getX() + ", " + getY() + ")";
    }
	
    public double calcArea() {
        return -1;
    }
	
	public String toString() {
		String rslt = "";
		rslt += "타입: 도형\n중심좌표: " + positionStr();
		return rslt;
	}
}
