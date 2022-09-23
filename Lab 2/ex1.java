public class ex1{
	public static void main(String[] args){
		int miles, yards;
		double kilometer;
		
		miles = 25;
		yards = 385;
		
		kilometer = (miles*1.609)+(yards*(1.609/1760.0));
		
		System.out.println("Number of KM : " + kilometer);
	}
}