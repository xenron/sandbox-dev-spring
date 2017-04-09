package geym.dg.ch5.thread;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CalculatorNameSpaceSupport extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("calculator",new CalculatorBeanDefinitorParse());
    }
}
