package ba.bitcamp.hajrudin.homeworkWeekend05.task01;

public class Main {
	public static void main(String[] args) {
		Character c1 = new Character("Ime 1", "MALE", true);
		Character c2 = new Character("Ime 2", "FEMALE", true);
		Character c3 = new Character("Ime 3", "MALE", true);
		Character c4 = new Character("Ime 4", "FEMALE", true);
		Character c5 = new Character("Enemy", "MALE", true);
		Event e1 = new Event(Event.REVENGE);
		Goal g1 = new Goal("Cilj", Goal.HARD, e1, c1);
		Protagonist p1 = new Protagonist("Prota1", "MALE", true, g1);
		p1.setEnemy(c5);
		p1.setMinorCharacter(c1);
		p1.setMinorCharacter(c2);
		p1.setMinorCharacter(c3);
		p1.setMinorCharacter(c4);
		int temp = p1.attainGoal();
		System.out.println(temp+"%");
		p1.isSuccess(temp);
	}
}
