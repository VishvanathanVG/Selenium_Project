package week1.day2;

import java.util.Arrays;

public class SumOfAllDigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=1546;
		
		String digit=Integer.toString(number);
		char[] c=digit.toCharArray();
		
		int sum=0;
		
		for(int i=0;i<c.length;i++) {
			
		int digitis=digit.charAt(i) - '0';
		//System.out.println(digit.charAt(i));
		System.out.println(digitis);
		sum=digitis+sum;
			
		}
	
		System.out.println(sum);
		
/*		String[] number= {"1546"};
		int size=number.length;
		int[] arr=new int[size];
		System.out.println(arr[0]=Integer.parseInt(number[0]));
		System.out.println(Arrays.toString(arr));
		
		String num="1546";
		int i=Integer.parseInt(num);
		System.out.println(i);
*/		
	/*	//int[] array=number.ToArray();
	//	Integer[] newarr= new Integer[number.length];
		System.out.println(newarr);
		System.out.println(newarr[0]);
	//	for(int i=0;i<number.length;i++) {
			newarr[i]= Integer.valueOf(i);
			
			System.out.println(newarr[i]);
			
		}
	*/	
		
		//String[] str= Integer.toString(number).split("");
	   /*  int[] len = number.length.;
		System.out.println(number.length);
		*/
	/*	String temp= Integer.toString(number);
		int[] num=new int[temp.length()];
		System.out.println(num.length);
		System.out.println(num[0]);
		int sum = 0;
		for(int i=0;i<=num.length-1;i++) {
			sum=num[i+sum];
		}
	*/	
		//System.out.println(sum);
		
		
		
		//int[] num=new int[number];
		/*
		char[] c=number.toCharArray();
		System.out.println(c.length);
		//char[] sum;
		
		//System.out.println(c[0]);
		
		int[] num= new int[c.length];
		System.out.println(num[1]);
		
		for(int i=0;i<num.length;i++) {
			
			System.out.println(num[2]);
			break;
		}
		
		
	}
*/
}
}