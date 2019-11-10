package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RepeatingSecondCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="PayPal India";
		String companyName=name.replaceAll("\\s", "");
		char[] ca = companyName.toCharArray();


		Map<Character,Integer> listMap= new LinkedHashMap<Character,Integer>();
		//Map<Character,Integer> listMap= new TreeMap<Character,Integer>();
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

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Entry<Character, Integer> eachMap : listMap.entrySet()) {
			System.out.println(eachMap.getKey()+"-"+ eachMap.getValue());
			list.add(eachMap.getValue());
		}

		Collections.sort(list);
		System.out.println("**aftersort**");
		System.out.println(list);
		int size=list.size()-2;
		Integer val = list.get(size);
		
		for(Entry<Character, Integer> eachMap : listMap.entrySet()) {
			if(eachMap.getValue()==val) {
				System.out.println("2nd Most Repeat Character is : " +eachMap.getKey()+"-"+ eachMap.getValue());
			}
		}

	}

}
