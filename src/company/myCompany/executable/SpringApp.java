
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
	Customer firstCustomer = context.getBean(id, Customer.class);
		
		// call methods on the bean
	System.out.println(firstCustomer.getType()); 
	System.out.println(firstCustomer.getFeedback()); 
	
	 	// close the context
	
	context.close(); 
	
	}
	
}
