package week1.day2;

public class ConvertNegativetoPositive {

	public static void main(String[] args) {
		int num = -40;
		if(num>0) {
			System.out.println("The given number is positive:" +num);
		}
		else if(num<0) {
			System.out.println("The given number is negative:" +num);
			System.out.println("Converted positive number:" +num*-1);
			
		}
		
	 }

}
