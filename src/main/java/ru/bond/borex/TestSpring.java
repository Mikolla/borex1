package ru.bond.borex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
