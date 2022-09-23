import java.util.Scanner;

public class ex3{
	public static void main(String args[]){
		
		int length, width, height, volume;
		
		Scanner Sc = new Scanner (System.in);
		
		System.out.println("Enter Length : ");
		length = Sc.nextInt();
		
		System.out.println("Enter Width : ");
		width = Sc.nextInt();
		
		System.out.println("Enter Height : ");
		height = Sc.nextInt();
		
		volume = length*width*height;
		
		System.out.println("Volume of Cube = " + volume);
	}
}