package geym.dg.ch5.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	@Test
	public void testSingleton(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:geym/dg/ch5/scope/singleton-spring.xml");
		System.out.println("helloBean="+System.identityHashCode(context.getBean("helloBean")));
		System.out.println("helloBean="+System.identityHashCode(context.getBean("helloBean")));

		System.out.println("helloBeanN="+System.identityHashCode(context.getBean("helloBeanN")));
		System.out.println("helloBeanN="+System.identityHashCode(context.getBean("helloBeanN")));
	}

	@Test
	public void testThreadScope(){
		final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:geym/dg/ch5/scope/singleton-spring.xml");
		System.out.println("helloBean="+System.identityHashCode(context.getBean("helloBeanT")));
		System.out.println("helloBean="+System.identityHashCode(context.getBean("helloBeanT")));

		new Thread(){
			public void run(){
				System.out.println("helloBean="+System.identityHashCode(context.getBean("helloBeanT")));
			}
		}.start();

		new Thread(){
			public void run(){
				System.out.println("helloBean="+System.identityHashCode(context.getBean("helloBeanT")));
			}
		}.start();
	}
}
