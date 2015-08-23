package ba.bitcamp.hajrudin.homework28.task1;

public class Complaint {
	private Integer id;
	private String date;
	private String message;

	public Complaint(Integer id, String date, String message) {
		super();
		this.id = id;
		this.date = date;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ID: " + id + " DATE AND TIME: " + date + " COMPLAINT: "
				+ message + "\n";
	}

}
