package core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springAS2.xml");
		
		Question question = (Question) context.getBean("question");
		question.displayAnswerList();
		
		Question question2 = (Question) context.getBean("question2");
		question2.displayAnswerSet();
		
		Question question3 =  (Question) context.getBean("question3");
		question3.displayAnswerMap();

	}

}
