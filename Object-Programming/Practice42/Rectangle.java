//컴퓨터학과 20250492 이윤진
public class Rectangle {
	private int width;
	private int height;
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	int getArea() {
		return width * height;
	}
	
	int getPerimeter() {
		return 2 * (width + height);
	}
}
