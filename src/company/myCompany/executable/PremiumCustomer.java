package company.myCompany.executable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PremiumCustomer implements Customer {

	private FeedbackService feedbackService; //interface
	
	@Autowired
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
