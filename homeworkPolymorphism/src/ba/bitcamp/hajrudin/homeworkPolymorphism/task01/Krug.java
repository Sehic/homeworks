package ba.bitcamp.hajrudin.homeworkPolymorphism.task01;

public class Krug extends KompleksnoTijelo{
	
	private int r;
	
	public Krug(int r){
		this.r=r;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public double getPovrsina(){
		return Math.PI*(this.r*this.r);
	}

	@Override
	public String toString() {
		return "{r="+r+"} \n";
	}
	
	
	
	
}
