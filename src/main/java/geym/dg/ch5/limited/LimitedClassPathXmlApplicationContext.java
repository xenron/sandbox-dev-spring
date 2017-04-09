package geym.dg.ch5.limited;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LimitedClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
  private List<ConfigurableApplicationContext> accessibleFactories;

  public LimitedClassPathXmlApplicationContext(String... configLocations) throws BeansException {
    super(configLocations, true, null);
  }

  public LimitedClassPathXmlApplicationContext(List<ConfigurableApplicationContext> accessibleFactories,
      String... configLocations) throws BeansException {
    super((ApplicationContext) null);
    this.accessibleFactories = accessibleFactories;
    setConfigLocations(configLocations);
    refresh();
  }

  public LimitedClassPathXmlApplicationContext(String[] configLocations, ApplicationContext parent)
      throws BeansException {
    super(configLocations, true, parent);
  }

  protected DefaultListableBeanFactory createBeanFactory() {
    ExtListableBeanFactory bf = new ExtListableBeanFactory(getInternalParentBeanFactory());
    bf.setAccessibleFactories(accessibleFactories);
    return bf;
  }
}
