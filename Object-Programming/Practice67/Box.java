//컴퓨터학과 20250492 이윤진
public class Box {
	private int x;
	private int y;
	private int z;
	
	public String toString(){
		String rslt = "";
		rslt += "가로: " + x + ", ";
		rslt += "세로: " + y + ", ";
		rslt += "높이: " + z;
		return rslt;
	}
	/*
	public void fillBox() {
		empty = false;
	}
	
	public void emptyBox() {
		empty = true;
	}
	*/
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getVolume() {
		return x * y * z;
	}
	
	public double getWeight() {
		return getVolume() * 1.1;
	}
}
