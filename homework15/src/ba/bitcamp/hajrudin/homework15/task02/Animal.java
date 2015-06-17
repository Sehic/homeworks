package ba.bitcamp.hajrudin.homework15.task02;

public class Animal {
	private String name;
	private Byte isActive;
	private Byte water;
	private static Byte isDayOrNight;
	private static Byte waterInHabitat;
	
	public Animal(String name, Byte isActive, Byte water) {
		super();
		this.name = name;
		this.isActive = isActive;
		this.water = water;
		this.isDayOrNight = 1;
		this.waterInHabitat = 1;
	}
	
	public String toString(){
		String s = "";
		if(this.isActive.equals(this.isDayOrNight) && this.waterInHabitat>=this.water){
			s="It's fine. The animal is active and has water.";
		} else if(this.isActive.equals(this.isDayOrNight) && this.waterInHabitat<this.water){
			s="The animal is active, but does not have enough water.";
		} else if(this.isActive!=this.isDayOrNight && this.waterInHabitat>=this.water){
			s="The animal is not active, but has enough water.";
		} else {
			s="The animal is not active and it does not have enough water.";
		}
		return s;
	}
	
	public static void setIsDayOrNight() {
		if (Animal.isDayOrNight == 1){
			Animal.isDayOrNight=2;
		} else {
			Animal.isDayOrNight=1;
		}
	}
	public static void setWaterInHabitat(Byte waterInHabitat) {
		Animal.waterInHabitat = waterInHabitat;
	}
	
	
	
	
	
	
	
}
