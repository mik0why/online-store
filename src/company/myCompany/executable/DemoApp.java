package company.myCompany.executable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		
		//context + read the config file
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("appContext.xml");
		
		//write to the config file
		
		//retrieve the bean based on the type of the user
		
		
		// get the bean from spring container
		Customer customer = context.getBean("regularCustomer", Customer.class);
		Customer custTwo = context.getBean("premiumCustomer", Customer.class);
		Customer custThree = context.getBean("premiumCustomer", Customer.class);
		// call a method on the bean
		System.out.println(customer.getFeedback());
		System.out.println(customer.getType());
		System.out.println(custTwo.getFeedback());
		
		
		//close context
		context.close(); 
	}

}
