package core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springAS1.xml");
		
		//Setter Injection
		CustomerSetter customer = (CustomerSetter) context.getBean("customersetter");
		customer.customer();
		 
		//Constructor Injection
		CustomerConstructor constructor = (CustomerConstructor) context.getBean("customerconstructor");
		constructor.customer();

	}

}
