package week1.day2;

import java.util.Arrays;

public class DuplicateNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]data= {1,2,8,2,9,8};
		
		Arrays.sort(data);
		
		for(int i=0;i<data.length-1;i++) {
			
			if(data[i]==data[i+1]){
				
				System.out.println(data[i]);
				
			}
			
		}
		
		
	}

}
