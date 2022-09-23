class Student{
	String name, dltNo, address;
}
public class Test{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.name = "Kamal";
		s1.dltNo = "IT7821";
		s1.address ="Colombo";
		
		Student s2 = new Student();
		s1.name = "Nimal";
		s1.dltNo = "IT7821";
		s1.address ="Galle";
		
		Student s3 = new Student();
		s1.name = "Amal";
		s1.dltNo = "IT7821";
		s1.address ="Kandy";
		
		System.out.println("Name : " + s1.name + "\nDIT Number : " + s1.dltNo + "\n" )
	}
}