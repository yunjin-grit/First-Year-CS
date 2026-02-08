package fruit;
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
	
	public Food() {
		calory = 0; price = 0; weight = 0.0;
	}
	
	public void setCalory(int calory) {
		this.calory = calory;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getCalory() {
		return calory;
	}
}
