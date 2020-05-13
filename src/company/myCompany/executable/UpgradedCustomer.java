package company.myCompany.executable;

public class UpgradedCustomer implements Customer {

	private FeedbackService service; 
	private String emailAddress; 
	private String location; 
	
	
	public UpgradedCustomer() {
	}
	

	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

 
	@Override
	public String getType() {
		return "Upgraded." ;
	}

	@Override
	public String getFeedback() {
		return service.getFeedback(); 
	}
	
	public void setService(FeedbackService service) {
		this.service = service;
	}

}
 