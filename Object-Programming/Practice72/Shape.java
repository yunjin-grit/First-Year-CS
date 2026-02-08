//컴퓨터학과 20250492 이윤진
public class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		String rslt = "";
		rslt += "중심좌표 : (" + x + ", " + y + ")\n";
		return rslt;
	}
}
