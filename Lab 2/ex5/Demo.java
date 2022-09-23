import java.util.scanner;
public class Demo{
	public static void main(String args[]){
		//create an object using EvenOddNumber class
			EvenOddNumber EONum = new EvenOddNumber();
			
			Scanner sc= new Scanner (System.in);
			
			//get user input
			System.out.println("Enter a Number : ");
			int Num = sc.nextInt();
			
			//variable to vatch true or false
			boolean result = EONum.findEvenorOdd(Num);
			
			if(result == true){
				System.out.println("It is a even number");
			}else{
				System.out.println("It is a odd number");
			}
	}
	
}