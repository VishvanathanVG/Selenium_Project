package week3.day1;

public class Calculator {

	
	public int add(int a,int b ) {
		
		int add= a + b;
		System.out.println("Addition Values 2 arguments:" + add);
		return add;		
	}
	
	public int add(int a,int b , int c) {
		
		int sub= a-b-c;
		System.out.println("Addition Values 3 arguments:" + sub);
		return sub;
		
	}
	
	public float add(int e , float f) {
		
		float addFloat = e + f;
		System.out.println("Addition Values int and float arguments: "+ addFloat);
		return addFloat;
		
	}
	
	public double add(double d1, double d2,double d3) {
		
		double subFloat= d1-d2-d3;
		System.out.println("Addition Values 3 double arguments:" + subFloat);
		return subFloat;
	}
	
	
}
