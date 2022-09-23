public class MyTestMain{
	public static void main(String args[]){
		Person P1 = new Person();
		Person p2 = new Person("Kamal", 22, 50.0);
		p2.setName("Nimal");
		System.out.println(p2.getName());
	}
}