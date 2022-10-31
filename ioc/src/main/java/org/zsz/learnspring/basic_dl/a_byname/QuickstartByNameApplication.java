package org.zsz.learnspring.basic_dl.a_byname;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_dl.a_byname.bean.Person;

@Slf4j
public class QuickstartByNameApplication {
    
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) factory.getBean("person");
        log.info("person -> {}", person);
    }

}
