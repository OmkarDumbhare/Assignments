package core_assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
	
	  private  String name;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    
	    public void work() {
	    	System.out.println(getName() +" is Working!!!");
	    }

		
		public void afterPropertiesSet() throws Exception {
			System.out.println("Initializing the Employee Bean");
			
		}
		
		public void destroy() throws Exception {
			System.out.println("Destroying the Employee Bean");
			
		}
		
		//(Use init-method and destroy-method in xml config file)

		public void myInit(){
		        System.out.println("Employee bean using Init");
		    }

		public  void  myDest(){
		        System.out.println("Employee bean using Destroy");
		    }
		
		//(Use @PostConstruct and @PreDestroy)

		  @PostConstruct
		    public void postConstruct(){
		        System.out.println("using annontation init called");
		    }

		    @PreDestroy
		    public  void  preDestroy(){
		        System.out.println("destroy called using preDestroy annotation");
		    }
		}

