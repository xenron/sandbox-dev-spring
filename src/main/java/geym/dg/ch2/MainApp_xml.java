package geym.dg.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * simple demo
 * @author e593274
 *
 */
public class MainApp_xml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch2/Beans_xml.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
    }
}
