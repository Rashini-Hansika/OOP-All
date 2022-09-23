public class Student extends Person{
	private String sid;
	
	public Student(){
		super();
		System.out.println("Student default constructor");
	}
	public Student(String name, int age, double sal){
		System.out.println("Student parameterized constructor");
	}
	public Student(String name, int age, double sal, String sid){
		this(name, age);
		System.out.println("Student 2 parameterized constructor");
	}
}