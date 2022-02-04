package core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springAS5.xml");
		
		Player playerReq = (Player) context.getBean("streq");
		playerReq.getPlayersDetails();
		
		
		
		Player playerRes = (Player) context.getBean("stres");
		System.out.println("\n");
		playerRes.getPlayersDetailsUsingResource();
		 

	}

}
