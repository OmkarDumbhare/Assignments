package core_assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
	public static void main(String[] args) {
		 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springAS8.xml");
		
		context.registerShutdownHook();
		
		Employee employee =(Employee) context.getBean("emp");
		employee.work();
		
		Employee employee2 =(Employee) context.getBean("emp1");
		employee.work();
		
		Employee employee3 =(Employee) context.getBean("emp2");
		employee.work();
	
	}

}
