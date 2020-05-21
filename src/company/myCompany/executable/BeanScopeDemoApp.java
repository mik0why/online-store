package company.myCompany.executable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("appContext.xml");
		
	Customer defaultCustomer = context.getBean("regularCustomer", Customer.class);
	Customer premiumCustomer = context.getBean("premiumCustomer", Customer.class);
	
	
	System.out.println(defaultCustomer.getType() + " is " + defaultCustomer.getFeedback()); 
	System.out.println(premiumCustomer.getType()); 
	

	context.close();
	}

}
