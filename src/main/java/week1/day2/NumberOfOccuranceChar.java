package week1.day2;

public class NumberOfOccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="vishvanathan";
		//va
	
		int counter=0;
		//char c1='v';
		char[] c =name.toCharArray();
		
		System.out.println(c.length);
		System.out.println(c[0]);
		
		for(int i=0; i<c.length;i++) {
			
			for(int j=0;j<i;j++) {
				
				if(c[i]==c[j]) {
				
				//if(c[i] = c1 ab && c[j]=c1) {
					
					counter++;
					
					
				}
			}
			
			
		}
		
		System.out.println(counter);
		
	}

}
