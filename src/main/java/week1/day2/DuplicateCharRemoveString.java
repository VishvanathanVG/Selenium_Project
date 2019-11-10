package week1.day2;

public class DuplicateCharRemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sreenish";
		
		char[] c= name.toCharArray();
		
		//System.out.println(name.charAt(0));
		
		System.out.println(c.length-1);
		
		for(int i=0;i<c.length;i++) {
			
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i] == c[j]) {
			     name = name.replaceAll(Character.toString(c[j]), "");
			
					}
				
			}
	
		}
		System.out.println("name:"+name);
	}

}
