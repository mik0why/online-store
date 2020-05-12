
package company.myCompany.executable;


import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class SpringApp {

	
	
	
	public static void main (String [] args) {
		// load the config file
	ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from container
	Customer firstCustomer = context.getBean("myCustomer", Customer.class);
	
	
		// call methods on the bean
	System.out.println(firstCustomer.getType());
	
	
		// close the context
	
	context.close(); 
	
	}
	
}
