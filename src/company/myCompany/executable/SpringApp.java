
package company.myCompany.executable;


import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class SpringApp {
	
	public static void main (String [] args) {
		// load the config file
	ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from container
		// the id is specified by the user
	
	String id = "upgradedCustomer"; 
	UpgradedCustomer firstCustomer = context.getBean(id, UpgradedCustomer.class);
		
		// call methods on the bean
	System.out.println(firstCustomer.getType()); 
	System.out.println(firstCustomer.getFeedback()); 
	System.out.println(firstCustomer.getEmailAddress()); 
	if(firstCustomer.getLocation().contains("Barcelona")){
		System.out.println("Spain");
	}else {
		System.out.println("Not Spain");
	}
	
	//firstCustomer.getLocation(); 
	 	// close the context

	
	context.close(); 
	
	}
	
}
