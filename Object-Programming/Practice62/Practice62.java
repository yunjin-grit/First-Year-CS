//컴퓨터학과 20250492 이윤진
public class Practice62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		int i = 1;
		while(true) {
			d1.roll();
			d2.roll();
			
			System.out.println(i + "차 : 첫번째 주사위 = " + d1.getValue() + ", 두번째 주사위 = " + d2.getValue());
			
			if(d1.getValue() == d2.getValue()) {
				break;
			}
			
			i++;
		}
		System.out.println("게임이 종료되었습니다.");
	}

}
