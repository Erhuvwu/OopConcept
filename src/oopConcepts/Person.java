package oopConcepts;

public class Person {
	 String name;
     int age;
	 int height;
	 char gender;
	
	 public Person() {
			
		}
	 public Person(String name, int age, int height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	 
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
public void display() {
		
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Height: " + this.height);
		System.out.println("Gender: " + this.gender);
}
	
		
		

	

}
