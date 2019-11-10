package week1.day2;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {3,2,1,4,6,7};
		
		Arrays.sort(data);
		
		for(int i=0;i<data.length;i++) {
			
			if (i+1!=data[i]) {
				
				System.out.println(i+1);
				break;
			}
			
		}
		
		
		
	}

}
