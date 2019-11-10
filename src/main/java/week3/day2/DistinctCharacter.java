package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Amazon India Private Limited";
		String companyName=name.replaceAll("\\s+", "");
		char[] ca=companyName.toCharArray();
		
		Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for (char eachChar : ca) {
			if(map.containsKey(eachChar)){
				int value=map.get(eachChar);
				map.put(eachChar, value+1);
				}
			else {
				map.put(eachChar, 1);
			}	
		}
		System.out.println(map);
		map.values().remove(" ");
		System.out.println(map);
		
		//Unique Character
		for (char eachChar :map.keySet()) {
			if(map.get(eachChar) >=1) {
				System.out.print(eachChar);
			}
			
					
		}
		
		
	}

}
