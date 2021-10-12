package oopConcepts;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.println("-----------Student's Info-----------------");
		Student student1 = new Student();
		
		System.out.println("Enter student_id");
		student1.setStudent_id(userInput.nextInt());
		userInput.nextLine();
		
		System.out.println("Enter student name");
		student1.setName(userInput.nextLine());
		
		System.out.println("Enter student age");
		student1.setAge(userInput.nextInt());
		
		System.out.println("Enter student height");
		student1.setHeight(userInput.nextInt());
		
		System.out.println("Enter student gender");
		student1.setGender(userInput.next().charAt(0));
		
		userInput.nextLine();
		System.out.println("Enter student major");
		
		student1.setMajor(userInput.nextLine());
		
		System.out.println("Enter student score for course 1 ");
		student1.setCourseScore1(userInput.nextDouble());
		
		System.out.println("Enter student score for course 2 ");
	    student1.setCourseScore2(userInput.nextDouble());
		
	    System.out.println("Enter student score for course3 ");
		student1.setCourseScore3(userInput.nextDouble());
		
		student1.display();
		System.out.println();
		
		System.out.println("-----------Employee's Info--------------");
		
		
		Employee employee1 = new Employee();
		
		System.out.println("Enter employee_id");
		employee1.setEmp_id(userInput.nextInt());
		
		System.out.println("Enter Employee's name");
		employee1.setName(userInput.nextLine());
		userInput.nextLine();
		
		System.out.println("Enter Employee's age");
		employee1.setAge(userInput.nextInt());
		
		System.out.println("Enter Employee's height");
		employee1.setHeight(userInput.nextInt());
		
		System.out.println("Enter Employee's gender");
		employee1.setGender(userInput.next().charAt(0));
		
		System.out.println("Enter employee salary");
		employee1.setEmp_salary(userInput.nextDouble());
		
		
		employee1.display();
		
System.out.println();
		
		System.out.println("-----------Person1's Info--------------");
		
		Person1 person = new Person1();
		person.setSalary(3000);
		person.setAddress("300 Grange Drive");
		person.setSex("female");
		
		System.out.println("Person's salary is: " + person.getSalary());
		System.out.println("Person's address is: " + person.getAddress());
		System.out.println("Person's sex is: " + person.getSex());
		

	}

}
