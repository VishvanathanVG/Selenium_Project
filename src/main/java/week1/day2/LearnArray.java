package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int[] data = {3,2,1,4,6,8,5};
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			if (i+1 != data[i]) {
				System.out.println(i+1);
				break;
			}
			
			//System.out.println("Expected : "+(i+1));
			// System.out.println("Actual: "+data[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Array - []
		/*int[] array = {4, 11, 2, 3};
		Arrays.sort(array);
		for (int i : array) {
		System.out.println(i);	
		}*/
		
//		System.out.println(array[array.length -1]);
		
		
		
		/*for (int i : array) {
			System.out.println(i);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		/*String[] colors = {"red", "black", "white"};
		for (String color : colors) {
			System.out.println(color);
		}*/
		
		
		
		/*int length = colors.length;
		System.out.println(colors[length - 1]);*/
		
		/*for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}*/
		
		
		/*int count = colors.length;
		System.out.println(count);*/
		
		

	}

}




