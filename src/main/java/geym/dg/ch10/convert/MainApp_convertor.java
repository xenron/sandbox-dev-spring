package geym.dg.ch10.convert;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Convertor
 * @author e593274
 *
 */
public class MainApp_convertor {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch10/convert/Beans.xml");
        Team obj = (Team) context.getBean("t");
        System.out.println(obj.getNames());
        System.out.println(obj.getLeader());

    }
}
