package org.zsz.learnspring.basic_dl.f_lazylookup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.common.Functions;
import org.zsz.learnspring.basic_dl.f_lazylookup.bean.Cat;
import org.zsz.learnspring.basic_dl.f_lazylookup.bean.Dog;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-31 14:33
 */
@Slf4j
public class LazyLookupApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
    Cat cat = context.getBean(Cat.class);
    log.info("cat -> {}", cat);

    // 下面的代码会报Bean没有定义 NoSuchBeanDefinitionException
    // Dog dog = context.getBean(Dog.class);
    // 这一行代码不会报错
    ObjectProvider<Dog> dogProvider = context.getBeanProvider(Dog.class);
    // 只有当执行getObject方法时才会检查是否存在，即实现了延迟查找
    log.info("dogProvider -> {}", dogProvider);

    // jdk8后ObjectProvider接口有了新的扩展：借助Supplier接口返回缺省创建
    Dog defaultDog = dogProvider.getIfAvailable(Dog::new);
    log.info("dogProvider -> {}", dogProvider);

    // 只有存在Bean时才会执行Consumer接口的方法
    Runnable existThenRun = () -> log.info("只有存在Bean时才会执行Consumer接口的方法");
    dogProvider.ifAvailable(Functions.noInputConsumer(existThenRun));
  }

}
