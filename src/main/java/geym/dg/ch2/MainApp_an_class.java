package geym.dg.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * simple demo
 *
 * @author e593274
 *
 */
public class MainApp_an_class {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld_an obj = context.getBean(HelloWorld_an.class);
		obj.getMessage();

		HelloWorld obj2 = context.getBean(HelloWorld.class);
		obj2.getMessage();

		OutBean out = context.getBean(OutBean.class);
		System.out.println(out.getHelloWorld()==obj2);

	}
}
