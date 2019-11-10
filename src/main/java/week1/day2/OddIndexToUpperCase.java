package week1.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="changeme";
		//int i=0;
		
	    char[] c =name.toCharArray();
	    
		for(int i=0;i<=c.length-1;i++) {
	//	char chartarry =name.charAt(i);
			
			if(i%2 !=0 ) {
					System.out.print(Character.toUpperCase(c[i]));	
					}
			else 
			{
					System.out.print(c[i]);
			}
				}
				
			}
			
			
		/*
		if(Character.isUpperCase(c[i]) && c[i%2] == 0) {
			
			System.out.println(Character.toLowerCase(c[i]));
		}
		
		else {
			if ((c[i%2] !=0 && ){
				
			}
			System.out.println(Character.toUpperCase(c[i]));
			
		}
	*/
		}
	
	

	

