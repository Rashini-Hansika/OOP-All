class Person{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		if(age>=0){
			this.age = age;
		}
		else{
			System.out.println("Age must be greater than 0");
		}
	}
}

public class Encapsulation{
	public static void main(String args[]){
		Person person = new Person();
		person.setName("Rashini Ambegoda");
		person.setAge(22);
		
		System.out.println("Name " + person.getName() + " and age is " + person.getAge());
	}
}