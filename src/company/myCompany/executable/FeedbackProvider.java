package company.myCompany.executable;

public class FeedbackProvider implements FeedbackService{

	@Override
	public String getFeedback() { 
		return "Satisfied with the experience"; 
		// TODO read from an external source (db/web service)
	}
	
	
	
	

}
