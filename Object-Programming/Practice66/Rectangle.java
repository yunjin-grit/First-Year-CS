//컴퓨터학과 20250492 이윤진
class Rectangle extends Shape {
	private int width;
	private int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
	
	public Rectangle() {
		super();
		height = 0; width = 0;
	}
	public Rectangle(int width, int height){
		super();
		this.height = height;
		this.width = width;
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	
	double  calcArea() {
		return getWidth() * getHeight();
	}
	
	public int calcPerimeter() {
		return (2 * getWidth()) + (2 * getHeight());
	}
	
	public void printInfo() {
		String str = String.format("%.2f", calcArea());
		System.out.println("사각형 :: 중심좌표 (" +  getX() + ", " + getY() + ") :: 면적 " + str + " :: 둘레 " + calcPerimeter());
		
	}
}
