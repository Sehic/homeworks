package ba.bitcamp.hajrudin.homework16.task01;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Radnik 1", 'M', 800);
		Employee e2 = new Employee("Radnica 2", 'F', 800);
		Employee e3 = new Employee("Radnik 3", 'M', 852);
		Employee e4 = new Employee("Radnica 4", 'F', 800);
		Employee e5 = new Employee("Radnik 5", 'M', 900);
		Employee e6 = new Employee("Radnica 6", 'F', 860);
		Employee e7 = new Employee("Radnik 7", 'M', 1000);
		Employee director = new Employee("Direktor", 'M', 1500);
		Employee [] employees = {e1,e2,e3,e4,e5,e6,e7};
		Firm f1 = new Firm("Firma 1", director, employees);
		System.out.println(f1.toString());
		System.out.println("Number of womens in firm: "+f1.getNumOfWomens());
		System.out.println("Sum of salary: "+f1.getSumOfSalary());
		f1.setSalary(150);
		System.out.println("Sum of salary: "+f1.getSumOfSalary());

	}

}
