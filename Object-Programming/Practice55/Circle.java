//컴퓨터학과 20250492 이윤진
public class Circle extends Shape {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		x=0;
		y=0;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public void draw() {
		String str1 = String.format("%.2f", getArea());
		double r = 2 * 3.14 * radius;
		String str2 = String.format("%.2f", r);
		print();
		System.out.print(":: 반지름: " + radius + " :: 면적: " + str1 + " :: 둘레: " + str2);
	}
}
