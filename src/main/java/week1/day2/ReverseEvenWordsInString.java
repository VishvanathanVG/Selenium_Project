package week1.day2;

public class ReverseEvenWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name =" I am a software tester ";
		String[] words=name.split(" ");
		System.out.println(words.length);
       // char[] ca =name.toCharArray();
      //  System.out.println(words[4]);
        
        for(int i=0;i<=words.length-1;i++){
        	
        	if(i%2==0) {
        		char[] even=words[i].toCharArray();
        		for(int j=even.length-1;j>=0;j--) {
        		
        			System.out.print(even[j] +"");
        		}
        		
        		System.out.print(" ");
        		
        		
        	}
        	else {
        	System.out.print(words[i]+ " ");
        	}
        }

	}

}
