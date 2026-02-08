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
		super(x, y, z);
		this.attribute = attribute;
	}
	
	public double getWeight() {
		if(getAttribute().equals("paper")) {
			return getVolume() * 1.5;			
		}
		else if(getAttribute().equals("wood")) {
			return getVolume() * 2.5;			
		}
		else {
			return getVolume() * 1.1;
		}
	}
	
	@Override
	public String toString(){
		String rslt = "";
		rslt += super.toString();
		rslt += "\n재질: " + getAttribute();
		return rslt;
	}
}
