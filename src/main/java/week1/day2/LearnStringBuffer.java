package week1.day2;

public class LearnStringBuffer {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("testleaf");
		System.out.println(sb.reverse());
		
		
//		System.out.println(sb.substring(2,6));
//		sb.inse
		
		
		
		sb.append(" chennai");
		System.out.println(sb);
		
		
		
		
		
		String cpm = "testleaf";
//		System.out.println(cpm.concat(" chennai"));
		cpm=cpm.concat(" chennai");
		System.out.println(cpm);
	}

}




