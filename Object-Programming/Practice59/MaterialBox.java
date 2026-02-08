//컴퓨터학과 20250492 이윤진
class MaterialBox extends Box {
	private String attribute;
	
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	String getAttribute() {
		return attribute;
	}
	
	public MaterialBox(int x, int y, int z, String attribute) {
		setX(x); setY(y); setZ(z); this.attribute = attribute;
	}
	
	public void printInfo() {
		System.out.println("가로: " + getX() + ", 세로: " + getY() + ", 높이: " + getZ());
		System.out.println("재질: " + getAttribute() + ", 부피: " + getVolume() + ", 무게: " + String.format("%.2f", getWeight()));
	}
}
