package company.myCompany.executable;

public class RegularCustomer implements Customer{
	
	private FeedbackService feedbackService; 
	
	// add no param constructor?
	
	public RegularCustomer(FeedbackService service) {
		feedbackService = service;  
	}
	
	public String getType() {
		return "Regular";
	}

	@Override
	public String getFeedback() {
		return feedbackService.getFeedback(); 
	}

	//init method
	public void setupMethod() {
		System.out.println("bean setup");
	}
	
	//destroy method
	public void cleanupMethod() {
		System.out.println("Bean cleanup");
	}

}
 