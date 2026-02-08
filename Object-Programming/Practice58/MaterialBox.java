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
}
