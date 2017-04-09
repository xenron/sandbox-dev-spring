package geym.dg.ch5.limited;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClassPathXmlApplicationContextTest {

  @Test
  public void test() {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:geym/dg/ch5/limited/meta-spring.xml");

    ClassPathXmlApplicationContext sc = context.getBean("level3",ClassPathXmlApplicationContext.class);
    System.out.println(sc);
    sc.getBean(HelloWorldH.class).printHello();
    sc.getBean(HelloWorld.class).printHello();

  }
}
