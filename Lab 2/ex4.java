import java.io.*;

public class ex4{
	public static void main(String args[])throws IOException{
		
		int length, width, height, volume;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		System.out.println("Enter Length : ");
		length = Integer.parseInt(in.readLine());
		
		
		System.out.println("Enter Width : ");
		width= Integer.parseInt(in.readLine());
		
		System.out.println("Enter Height : ");
		height = Integer.parseInt(in.readLine());
		
		volume = length*width*height;
		
		System.out.println("Volume of Cube = " + volume);
	}
}