package geym.dg.ch3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * simple demo
 * @author e593274
 *
 */
public class MainApp_xml {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch3/Beans_xml.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
    }
}
