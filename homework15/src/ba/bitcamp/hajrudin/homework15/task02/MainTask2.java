package ba.bitcamp.hajrudin.homework15.task02;

public class MainTask2 {

	public static void main(String[] args) {
		Byte a = 1;
		Byte b = 2;
		Byte c = 3;
		Animal a1 = new Animal("Animal 1", a, a);
		Animal a2 = new Animal("Animal 2", b, c);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		Animal.setIsDayOrNight();
		Animal.setWaterInHabitat(c);
		System.out.println(a1.toString());
		System.out.println(a2.toString());

	}

}
