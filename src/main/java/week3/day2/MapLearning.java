package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="vishvanathan";
		char[] ca = name.toCharArray();
		
		
		Map<Character,Integer> listMap= new LinkedHashMap<Character,Integer>();
		int value=0;
		for (char c : ca) {
			if(listMap.containsKey(c)) {
				value = listMap.get(c);
				listMap.put(c,value+1);
				
			}
			else {
				listMap.put(c,1);
			}
				
		}
		System.out.println(listMap);
	
		for(Entry<Character, Integer> eachMap : listMap.entrySet()) {
			System.out.println(eachMap.getKey()+"-"+ eachMap.getValue());
		}
		
	}

}
