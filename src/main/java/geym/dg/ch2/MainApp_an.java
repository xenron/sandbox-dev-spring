package geym.dg.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * simple demo
 * @author e593274
 *
 */
public class MainApp_an {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch2/Beans_an.xml");
        HelloWorld_an obj =  context.getBean(HelloWorld_an.class);

        obj.getMessage();

    }
}
