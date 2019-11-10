package week1.day2;

import java.util.Arrays;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {1,2,1,22,23,34,44,33,34,22,1,34};
		Arrays.sort(data);
	/*	for (int eachValue : data) {
			System.out.print(eachValue + ",");
		}*/
		//System.out.println(data[0]);
		for(int i=0;i<data.length-1;i++) {
			if(data[i]==data[i+1]) {
				System.out.print(data[i] + ",");
			}
		}	
	}

}
