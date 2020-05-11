
package company.myCompany.executable;


import org.springframework.context.support; 

public class SpringApp {

	
	
	
	public static void main (String [] args) {
		// load the config file
	ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationConcext("applicationContext.xml");
		
		// retrieve the bean from container
	Customer myCoach = context.getBean("myCustomer", Coach.class);
	
	
		// call methods on the bean
	System.out.println(myCoach.getType());
	
	
		// close the context
	
	context.close(); 
	
	}
	
}
