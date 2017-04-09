package geym.dg.ch5.limited;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;

public class ExtListableBeanFactory extends DefaultListableBeanFactory {
  private List<ConfigurableApplicationContext> accessibleFactories;

  public ExtListableBeanFactory(BeanFactory parentBeanFactory) {
    super(parentBeanFactory);
  }

  public void setAccessibleFactories(List<ConfigurableApplicationContext> accessibleFactories) {
    this.accessibleFactories = accessibleFactories;
  }

  public <T> T getBeanExt(String name, Class<T> requiredType, Object... args) {
    if (accessibleFactories == null || accessibleFactories.size() == 0)
      return null;
    for (ConfigurableApplicationContext ac : accessibleFactories) {
      try {
        T bean = ((ExtListableBeanFactory) ac.getBeanFactory()).getBeanSuper(name, requiredType, args);
        if (bean != null) {
          return bean;
        }
      } catch (BeansException e) {

      }
    }
    return null;
  }

  public <T> T getBeanExt(String name, Class<T> requiredType) {
    if (accessibleFactories == null || accessibleFactories.size() == 0)
      return null;
    for (ConfigurableApplicationContext ac : accessibleFactories) {
      try {
        T bean = ((ExtListableBeanFactory) ac.getBeanFactory()).getBeanSuper(name, requiredType);
        if (bean != null) {
          return bean;
        }
      } catch (BeansException e) {

      }
    }
    return null;
  }

  public Object getBeanExt(String name) {
    if (accessibleFactories == null || accessibleFactories.size() == 0)
      return null;
    for (ConfigurableApplicationContext ac : accessibleFactories) {
      try {
        Object bean = ((ExtListableBeanFactory) ac.getBeanFactory()).getBeanSuper(name);
        if (bean != null) {
          return bean;
        }
      } catch (BeansException e) {
      }
    }
    return null;
  }

  public <T> T getBeanExt(Class<T> requiredType) {
    if (accessibleFactories == null || accessibleFactories.size() == 0)
      return null;
    for (ConfigurableApplicationContext ac : accessibleFactories) {
      try {
        T bean = ((ExtListableBeanFactory) ac.getBeanFactory()).getBeanSuper(requiredType);
        if (bean != null) {
          return bean;
        }
      } catch (BeansException e) {
      }
    }
    return null;
  }


  public <T> T getBeanSuper(String name, Class<T> requiredType, Object... args) throws BeansException {
    return super.getBean(name,requiredType,args);
  }

  public <T> T getBeanSuper(String name, Class<T> requiredType) throws BeansException {
    return super.getBean(name,requiredType);
  }

  public Object getBeanSuper(String name, Object... args) throws BeansException {
    return super.getBean(name,args);
  }

  public Object getBeanSuper(String name) throws BeansException {
    return super.getBean(name);
  }

  public <T> T getBeanSuper(Class<T> requiredType) throws BeansException {
    return super.getBean(requiredType);
  }

  @Override
  public <T> T getBean(String name, Class<T> requiredType, Object... args) throws BeansException {
    T re = getBeanExt(name, requiredType, args);
    if (re != null)
      return re;
    return doGetBean(name, requiredType, args, false);
  }

  @Override
  public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
    T re = getBeanExt(name, requiredType);
    if (re == null) {
      re = doGetBean(name, requiredType, null, false);
    }
    return re;
  }

  @Override
  public Object getBean(String name, Object... args) throws BeansException {
    Object re = getBeanExt(name, null, args);
    if (re != null)
      return re;
    return doGetBean(name, null, args, false);
  }

  @Override
  public Object getBean(String name) throws BeansException {
    Object re = getBeanExt(name);
    if (re != null)
      return re;
    return doGetBean(name, null, null, false);
  }

  @Override
  public <T> T getBean(Class<T> requiredType) throws BeansException {
    T re = getBeanExt(requiredType);
    if (re == null) {
      return super.getBean(requiredType);
    }
    return re;
  }


}
