//컴퓨터학과 20250492 이윤진
public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public String toString(){
		String rslt = "";
		rslt += "가로: " + x + "cm\n";
		rslt += "세로: " + y + "cm\n";
		rslt += "높이: " + z + "cm\n";
		if(empty) {
			rslt += "지금 박스는 비어 있습니다.";
		}
		else {
			rslt += "지금 박스에는 물건이 들어 있습니다.";
		}
		return rslt;
	}
	
	public void fillBox() {
		empty = false;
	}
	
	public void emptyBox() {
		empty = true;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	int getZ() {
		return z;
	}
		
	public Box() {
		x = 0;
		y = 0;
		z = 0;
		empty = true;
	}
	
	public Box(int x, int y, int z) {
		setX(x);
		setY(y);
		setZ(z);
		empty = true;
	}
	
	public int getVolume() {
		return getX() * getY() * getZ();
	}
	
	public double getWeight() {
		return getVolume() * 1.1;
	}
}
