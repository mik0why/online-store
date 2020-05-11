package company.myCompany.executable;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer regular = new RegularCustomer();
		Customer premium = new PremiumCustomer(); //not configurable 
		System.out.println(premium.getType());
		
		

	}

	

}
