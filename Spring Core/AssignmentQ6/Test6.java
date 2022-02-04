package core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
public static void main(String[] args) {
	

	  ApplicationContext context = new ClassPathXmlApplicationContext("springAS6.xml");
      dbConfig config = (dbConfig) context.getBean("dbConfig");
       config.display();
}
}
