package ba.bitcamp.hajrudin.homework28.task2;

public class Article {
	private String code;
	private String name;
	private Double price;

	public Article(String code, String name, Double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Code: " + code + " Name: " + name + " Price: " + price + "\n";
	}

}
