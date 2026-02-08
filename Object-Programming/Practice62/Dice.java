//컴퓨터학과 20250492 이윤진
import java.util.Random;
public class Dice {
	 private int value;
	 private Random rg;
	 
	 public Dice() {
		 value = 0;
		 rg = new Random();
	 }
	 
	 private void setValue(int value) {
		 this.value = value;
	 }
	 
	 public void roll() {
		 setValue(rg.nextInt(6) + 1);
	 }
	 
	 public int getValue() {
		 return value;
	 }
	 
	 public String toString() {
		 String rslt = "";
		 rslt += "주사위 = ";
		 rslt += value;
		 return rslt;
	 }
}
