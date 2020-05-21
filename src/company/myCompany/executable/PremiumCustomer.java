package company.myCompany.executable;

import org.springframework.stereotype.Component;

@Component("premCust")
public class PremiumCustomer implements Customer {

//	private FeedbackService feedbackService; //interface
	

	
	@Override
	public String getType() {
		return "Premium"; 
		
	}

	@Override
	public String getFeedback() {
		return "satisfied"; 
	}
			
}
