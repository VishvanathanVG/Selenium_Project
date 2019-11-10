package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		int remainder;
		boolean isPrime = true;
		
		for(int i=1;i<=100;i++) {
			
			for (int j=2;j<=i%2;j++) {
				
				remainder=i/j;
				if (remainder == 0){
					
					isPrime=false;
					
					//System.out.println(i);
				}
				
				if(isPrime) {
					
					System.out.print(i +" ,");
				}
				else {
					
					
				}
					
				}
				
		
			}
			 

		}*/

		
		
		int remainder=0;
		int flag=0;
		
		for(int i=1;i<=100;i++) {
			
			remainder=i/2;
			
			if(i==0||i==1) {
				System.out.println(i +" is not a prime number");
			}
			
			else 
			{
				
				for (int j=2;j<=100;j++) {
					if(i%j==0) {
					
					//	System.out.println(i +"is not prime number");	
						flag =1;
					}
					
					
				}
				
				if(flag==0) {
					
					System.out.println(i +"Prime number");
				}
			}
		}
		
		
		
		
		
		
		
	}

}






