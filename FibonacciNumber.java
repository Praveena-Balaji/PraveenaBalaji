package week1.day2;

public class FibonacciNumber {

	public static void main(String[] args) {
		int frstnum1=0;
		int scndnum2=1;
		int num3;
		int i;
		int range=8;    
		 System.out.print(frstnum1+" "+scndnum2);    
		    
		 for(i=2;i<range;i++)    
		 {    
		  num3 = frstnum1+scndnum2;    
		  System.out.print(" "+num3);    
		  frstnum1=scndnum2;    
		  scndnum2=num3;    
		 }    
		  
		

	}

}
