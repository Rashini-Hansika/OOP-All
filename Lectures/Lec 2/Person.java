class Person{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String x){
		name = x;
	}
	public int getAge(){
		return age;
	}
	public void age(int y){
		age = y;
	}
	public void setAge(int age){
		if (age>=5){
			this.age= age;
		}
		else{
			System.out.println("This age should be greater than 5");
		}
	}
} 


