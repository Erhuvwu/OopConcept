package oopConcepts;

public class Employee extends Person implements PersonInterface {
	int emp_id;
	double emp_salary;

	public Employee() {
		
	}
	
	public Employee(String name, int age, int height, char gender, int emp_id, double emp_salary) {
		super(name, age, height, gender);
		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
	}
	

public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public double getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}



public void display() {
	System.out.println(ORGANIZATION);
	System.out.println("-----------");
	System.out.println("Id: " + this.emp_id);
	super.display();
	System.out.println("Employee's Salary: " + this.emp_salary);
	System.out.println(this.calculate(1000));
}
public double calculate(int bonus) {
	System.out.print("The employee's net salary is: ");
	double netsalary = bonus + this.emp_salary;
	return netsalary;
	
}


	
}
