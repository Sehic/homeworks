package ba.bitcamp.hajrudin.homeworkPolymorphism.task01;

public class Pravougaonik extends KompleksnoTijelo{
	
	private int a;
	private int b;
	
	public Pravougaonik(int a, int b){
		this.a=a;
		this.b=b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public double getPovrsina(){
		return this.a*this.b;
	}

	@Override
	public String toString() {
		return "{a="+a+" b="+b+"} \n";
	}
	
	
}
