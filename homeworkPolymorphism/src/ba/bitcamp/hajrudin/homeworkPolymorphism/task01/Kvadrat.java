package ba.bitcamp.hajrudin.homeworkPolymorphism.task01;

public class Kvadrat extends KompleksnoTijelo{
	
	private int a;
	
	public Kvadrat(int a){
		this.a=a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public double getPovrsina(){
		return this.a*this.a;
	}

	@Override
	public String toString() {
		return "{a="+a+"} \n";
	}
	
	
}
