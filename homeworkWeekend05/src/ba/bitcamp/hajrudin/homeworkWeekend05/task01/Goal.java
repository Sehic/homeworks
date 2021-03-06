package ba.bitcamp.hajrudin.homeworkWeekend05.task01;

public class Goal extends StoryElement{
	
	protected  static final int EASY = 0;
	protected static final int HARD = 1;
	protected static final int IMPOSIBLE = 2;
	
	private int level;
	private Event event;
	private Character person;
	
	public Goal(String name, int level, Event event, Character person) {
		super(name);
		this.level = level;
		this.event = event;
		this.person = person;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Character getPerson() {
		return person;
	}

	public void setPerson(Character person) {
		this.person = person;
	}
	
	
	
	
	
}
