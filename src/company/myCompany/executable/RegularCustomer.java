package company.myCompany.executable;

public class RegularCustomer implements Customer{
	
	private FeedbackService feedbackService; 

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


}
 