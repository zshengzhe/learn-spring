package org.zsz.learnspring.container.a_beanfactory;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.zsz.learnspring.container.a_beanfactory.bean.Dog;

/**
 * @author Linus Zhang
 * @create 2022-11-09 23:52
 */
@Slf4j
public class ListableBeanFactoryApplication {

  public static void main(String[] args) {
    ClassPathResource resource = new ClassPathResource("container/listable-container.xml");
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
    reader.loadBeanDefinitions(resource);

    log.info("加载Xml文件后容器内的Bean:");
    Arrays.stream(beanFactory.getBeanDefinitionNames())
        .forEach(name -> log.info("{}", name));

    // 手动注册
    beanFactory.registerSingleton("dog", new Dog());
    log.info("手动注册单实例Bean后容器内的Bean:");
    Arrays.stream(beanFactory.getBeanDefinitionNames())
        .forEach(name -> log.info("{}", name));

    log.info("容器中真的有注册Dog:{}", beanFactory.getBean("dog"));
    // 通过getBeanNamesOfType查找
    log.info("容器中的所有Dog:{}", Arrays.toString(beanFactory.getBeanNamesForType(Dog.class)));
  }

}
