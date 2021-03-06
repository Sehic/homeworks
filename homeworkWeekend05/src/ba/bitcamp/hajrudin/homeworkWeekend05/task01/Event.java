package ba.bitcamp.hajrudin.homeworkWeekend05.task01;

public class Event {
	
	protected static final int DEFEAT = 0;
	protected static final int FRIENDSHIP = 1;
	protected static final int LOVE = 2;
	protected static final int REVENGE = 3;
	protected static final int MANIPULATION = 4;
	
	private int status;
	
	
	
	public Event(int status) {
		super();
		this.status = status;
	}



	public String getStatus(){
		String s = "";
		switch(this.status){
		case DEFEAT: s = "Defeat";
		break;
		case FRIENDSHIP: s = "Friendship";
		break;
		case LOVE: s = "Love";
		break;
		case REVENGE: s = "Revenge";
		break;
		default: s = "Manipulation";
		break;
		}
		return s;
	}
}
