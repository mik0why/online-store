package company.myCompany.executable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
	Customer defaultCustomer = context.getBean("regularCustomer", Customer.class);
	Customer premiumCustomer = context.getBean("regularCustomer", Customer.class);
		
		
	}

}
