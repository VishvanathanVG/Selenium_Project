package week3.day2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortCompanyReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new LinkedList<String>();
		list.add("CTS");
		list.add("HCL");
		list.add("Aspire Systems");
		list.add("Infosys");

		Collections.sort(list);
		System.out.println("***After sorting***");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("***After reverse sorting***");
		System.out.println(list);
	}
}
