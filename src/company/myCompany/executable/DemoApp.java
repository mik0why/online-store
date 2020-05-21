package company.myCompany.executable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		
		//context + read the config file
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("appContext.xml");
		
		// get the bean from spring container
		Customer customer = context.getBean("regCust", Customer.class);
		Customer custTwo = context.getBean("premCust", Customer.class);
		
		// call a method on the bean
		System.out.println(customer.getFeedback());
		System.out.println(custTwo.getFeedback());
		
		
		//close context
		context.close(); 
	}

}
