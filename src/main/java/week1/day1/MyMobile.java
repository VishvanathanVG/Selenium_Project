package week1.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mob = new Mobile();
		
		//getModel
		
		String mod =mob.getModel();
		System.out.println(mod);
		
		//getImei
		
		Long ime= mob.getImei();
		System.out.println(ime);
		
		//getcolor
		
		String col=mob.getColor();
		System.out.println(col);
		
		//getprice
		
		int pr = mob.getPrice(9000);
		if(pr>10000) {
			System.out.println("Your mobile price is 9999");
		}
		else {
			System.out.println("your mobile price is :" + pr);
					
		}
		
		//getAddphone
		 mob.getPhone(9524242092l);
		//System.out.println(ph);
		
	}

}
