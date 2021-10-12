package oopConcepts;

public class Student extends Person implements PersonInterface {
	int student_id;
	String major;
	double courseScore1, courseScore2, courseScore3;
	
	
	public Student(String name, int age, int height, char gender, int student_id, String major, double courseScore1,
			double courseScore2, double courseScore3) {
		super(name, age, height, gender);
		this.student_id = student_id;
		this.major = major;
		this.courseScore1 = courseScore1;
		this.courseScore2 = courseScore2;
		this.courseScore3 = courseScore3;
	}
	
	
public Student() {
		super();
	}



public int getStudent_id() {
	return student_id;
}


public void setStudent_id(int student_id) {
	this.student_id = student_id;
}


public String getMajor() {
	return major;
}


public void setMajor(String major) {
	this.major = major;
}


public double getCourseScore1() {
	return courseScore1;
}


public void setCourseScore1(double courseScore1) {
	this.courseScore1 = courseScore1;
}


public double getCourseScore2() {
	return courseScore2;
}


public void setCourseScore2(double courseScore2) {
	this.courseScore2 = courseScore2;
}


public double getCourseScore3() {
	return courseScore3;
}


public void setCourseScore3(double courseScore3) {
	this.courseScore3 = courseScore3;
}


public void display() {
	    System.out.println(ORGANIZATION);
	    System.out.println("-----------");
		System.out.println("Id: " + this.student_id);
		super.display();
		System.out.println("Student major: " + this.major);
		System.out.println("Subject 1 score: " + this.courseScore1);
		System.out.println("Subject 2 score: " + this.courseScore2);
		System.out.println("Subject 3 score: " + this.courseScore3);
		System.out.println(this.calculate(3));
		
		
}
	
	public double calculate(int totalSubjects) {
		System.out.print("The student's average is: ");
		double average = ((this.courseScore1 + this.courseScore2 + this.courseScore3)/totalSubjects);
		return average;
	}
}
