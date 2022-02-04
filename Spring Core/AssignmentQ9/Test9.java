package core_assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9 {

	public static void main(String[] args) {
		
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("springAS9.xml");
	        context.registerShutdownHook();

	        BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("LifeCycle");
	        beanLifeCycle.display();

	}

}
