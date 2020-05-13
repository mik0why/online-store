package company.myCompany.executable;

import java.util.Random; 
public class FeedbackProvider implements FeedbackService{

	@Override
	public String getFeedback() {
		Random rand = new Random(); 
		String[] feedbacks = new String[3]; 
		feedbacks[0] = "satisfied";
		feedbacks[1] = "sad";
		feedbacks[2] = "mediocre";
		

		
		return feedbacks[rand.nextInt(feedbacks.length)];
		
		
		
		// TODO read from an external source (db/web service)

		// TODO modify the output
	}
	
	
	
	

}
