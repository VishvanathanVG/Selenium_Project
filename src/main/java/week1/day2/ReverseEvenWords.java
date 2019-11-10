package week1.day2;

import java.util.Scanner;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words= "I am a Software Tester";
		String[] wd=words.split(" ");
		System.out.println(wd.length-1);
		
		for(int i=0;i<=wd.length-1;i++) {
				if(i%2 == 1) {
				char[] ca = wd[i].toCharArray();
				for(int j=ca.length-1;j>=0;j--) {
					System.out.print(ca[j] +"");
			
		}
				System.out.print(" ");
			}
				else {
				System.out.print(wd[i] + " ");
				}
		}
			
		
}

}
