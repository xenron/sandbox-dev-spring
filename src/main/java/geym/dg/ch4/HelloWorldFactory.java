package geym.dg.ch4;

import org.springframework.beans.factory.FactoryBean;

public class HelloWorldFactory implements FactoryBean<HelloWorld>{

	@Override
	public HelloWorld getObject() throws Exception {
		HelloWorld hw=new HelloWorld();
		hw.setMessage("I am from factory");
		return hw;
	}

	@Override
	public Class<?> getObjectType() {
		return HelloWorld.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
