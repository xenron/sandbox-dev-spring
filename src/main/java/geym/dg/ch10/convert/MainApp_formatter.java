package geym.dg.ch10.convert;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * formatter
 * @author e593274
 *
 */
public class MainApp_formatter {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch10/convert/Beans_formatter.xml");
        Team obj = (Team) context.getBean("t");
        System.out.println(obj.getNames());
        System.out.println(obj.getMemberCount());
        System.out.println(obj.getCreateDate());


    }
}
