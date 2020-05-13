package company.myCompany.executable;

public class UpgradedCustomer implements Customer {

	private FeedbackService service; 
	
	
	public UpgradedCustomer() {
		System.out.println("no arg constructor");
	}
	

	public void setService(FeedbackService service) {
		System.out.println("setting service");
		this.service = service;
	}

 
	@Override
	public String getType() {
		return "Upgraded." ;
	}

	@Override
	public String getFeedback() {
		return service.getFeedback(); 
	}

}
 