package geym.dg.ch6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:/geym/dg/ch6/Beans.xml");
		//System.out.println(context.getBean(HelloWorld.class).getMessage());
		context.getBean(HelloWorld.class).getMessage();
		System.out.println(context.getBean(HelloWorld.class));
	}	
}
