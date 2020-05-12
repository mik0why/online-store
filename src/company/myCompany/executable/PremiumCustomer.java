package company.myCompany.executable;

public class PremiumCustomer implements Customer {

	private FeedbackService feedbackService; //interface
	
	public PremiumCustomer(FeedbackService service) {
		feedbackService = service; 
	}
	
	@Override
	public String getType() {
		return "Premium"; 
		
	}

	@Override
	public String getFeedback() {
		return feedbackService.getFeedback(); 
	}

}
