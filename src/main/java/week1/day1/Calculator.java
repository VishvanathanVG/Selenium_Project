package week1.day1;

public class Calculator {
	
	
	public int sum(int a ,int b) {
		
		int summ = a + b;
		System.out.println("Sum value is : "+ summ);
		return summ;	
		
	}

	public int sub(int c, int d) {
		
		int subtr = c-d;
		System.out.println("Sub value is : "+ subtr);
		return subtr;
	}
	
	public int mul(int e , int f) {
		
		int mult=e*f;
		System.out.println("Mul value is : "+ mult);
		return mult;
	}
	
	
	public int div(int g , int h) {
		
		 int divi=g/h;
		System.out.println("Div value is : "+ divi);
		 return divi;
	}
}
