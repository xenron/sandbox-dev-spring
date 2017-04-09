package geym.dg.ch2;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "geym.dg.ch2")
public class AppConfig {

	@Bean
	public HelloWorld helloBean(){
		StringBuffer sb=new StringBuffer();
		return new HelloWorld();
	}

	@Bean
	public OutBean out(HelloWorld helloWorld){
		OutBean re=new OutBean();
		re.setHelloWorld(helloWorld);
		return re;
	}

}
