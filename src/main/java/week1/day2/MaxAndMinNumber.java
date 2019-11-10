package week1.day2;

import java.util.Arrays;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		//Maximum number
		System.out.println(data[data.length-1]);
		//Minimum Number
		System.out.println(data[0]);
		
		
	}

}
