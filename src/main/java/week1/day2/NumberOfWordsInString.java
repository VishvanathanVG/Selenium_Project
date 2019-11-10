package week1.day2;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data= "Vishva , Nathan Gomati & Sreenish Mouneesh";
		
        String[] words =data.split(" ");
		
		System.out.println(words.length);
		//System.out.println(words);
		for (String eachWords : words) {
			System.out.println(eachWords);
		}
		
	}

}
