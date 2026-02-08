//컴퓨터학과 20250492 이윤진
public class Shape {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	
	public Shape() {
		x = 0;
		y = 0;
	}
	public Shape(int x, int y){
		setX(x);
		setY(y);
	}
	
	public String toString() {
		String rslt = "";
		rslt += "도형 :: 중심좌표 (";
		rslt += x;
		rslt += ", ";
		rslt += y;
		rslt += ")";		
		return rslt;
	}
}
