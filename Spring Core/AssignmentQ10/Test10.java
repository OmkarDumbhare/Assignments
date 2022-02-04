package core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
	
	 public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("springAS10.xml");
	     
		 ContextAware aware = (ContextAware) context.getBean("contextAware");
		 aware.display();
		 
		 ContextAware aware2 = (ContextAware) context.getBean("contextAware1");
		 aware2.display();
	}
}
