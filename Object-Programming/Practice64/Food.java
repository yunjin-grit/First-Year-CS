//컴퓨터학과 20250492 이윤진
public class Food {
	int calory;
	protected int price;
	protected double weight;
	
	public String toString() {
		String rslt = "";
		rslt += "칼로리: " + calory + "\n";
		rslt += "가격: " + price + "\n";
		rslt += "무게: " + weight + "\n";
		return rslt;
	}
}
