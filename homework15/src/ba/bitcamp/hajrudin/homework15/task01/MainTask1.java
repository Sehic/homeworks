package ba.bitcamp.hajrudin.homework15.task01;

public class MainTask1 {

	public static void main(String[] args) {
		Safe s = new Safe("Crni fond");
		System.out.println(s.toString());
		s.setCurrentMoney(30);
		System.out.println(s.toString());
		s.setCurrentMoney(100);
		System.out.println(s.toString());
		s.getCurrentMoney();
		System.out.println(s.toString());

	}

}
