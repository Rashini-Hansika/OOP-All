public class Person{
	private String name;
	private int age;
	private double sal;
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setSal(double sal){
		this.sal = sal;
	}
	
	//getters
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getSal(){
		return sal;
	}
	
	//default constructor
	public Person(){
		this.name = null;
		this.age = 0;
		this.sal = 0;
	}
	
	//overloaded constructor
	public Person(String name, int age, double sal){
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
}