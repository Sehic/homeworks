package ba.bitcamp.hajrudin.homework16.task01;

import java.util.Arrays;

public class Firm {
	private String name;
	private Employee director;
	private Employee [] employees;
	
	
	public Firm(String name, Employee director, Employee[] employees) {
		this.name = name;
		this.director = director;
		this.employees = employees;
	}

	public int getNumberOfEmployees(){
		return this.employees.length;
	}
	
	public double getSumOfSalary(){
		double sum = 0;
		for(int i = 0; i<this.employees.length;i++){
			sum+=this.employees[i].getSalary();
		}
		return sum;
	}
	
	public int getNumOfWomens(){
		int num = 0;
		for(int i = 0; i<this.employees.length;i++){
			if(this.employees[i].getGender()=='F')
				num++;
		}
		return num;
	}
	
	public void setSalary(double salary){
		for(int i = 0; i<this.employees.length;i++){
			this.employees[i].setNewSalary(salary);
		}
		this.director.setNewSalary(salary);
	}

	public String toString() {
		String s = "";
		s = "Firm name: "+name+"\n";
		s+= "Directors name: "+director.getName() +"\n";
		s+= "Number of employees: "+employees.length+"\n";
		return s;
	}
	
	
}
