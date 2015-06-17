package ba.bitcamp.hajrudin.homework15.task01;

public class Safe {
	private String name;
	private Integer currentMoney;
	
	public Safe(String name) {
		super();
		this.name = name;
		this.currentMoney=0;
	}

	public Integer getCurrentMoney() {
		this.currentMoney=0;
		return currentMoney;
	}

	public void setCurrentMoney(Integer currentMoney) {
		this.currentMoney += currentMoney;
	}

	@Override
	public String toString() {
		String s = "";
		if(this.currentMoney==0){
			s="It is empty...";
		} else if(this.currentMoney<21){
			s = "There's some but not much";
		} else if(this.currentMoney<101){
			s="There's some.";
		} else {
			s = "There's a lot.";
		}
		return s;
	}
	
	
	
	
	
}
