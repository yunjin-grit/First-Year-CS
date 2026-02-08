package nofruit;
//컴퓨터학과 20250492 이윤진
import fruit.Food;

public class Potato extends Food {
	public int getUnitPrice() {
		return (int)(price / weight);
	}
	public String toString() {
		String rslt = "";
		rslt += "칼로리: " + getCalory() + "\n";
		rslt += "가격: " + price + "\n";
		rslt += "무게: " + weight + "\n";
		rslt += "단위가격: " + getUnitPrice() + "\n";
		return rslt;
	}
}
