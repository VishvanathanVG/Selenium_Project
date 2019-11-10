package week1.day2;

public class OccuranceSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="koushikk";
		
		int counter=0;
		
		char c='k';
		
		char[] chart= name.toCharArray();
		
		System.out.println(chart[0]);
		
		for (int i=0;i<chart.length;i++) {
			
			if (chart[i]==c) {
				
				counter ++;
			}
		}
		
		System.out.println(counter);
	}

}
