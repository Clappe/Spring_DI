package com.DepedenceInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeans_Inject_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        InnerBeans_Inject_TextEditor innerBeans_inject_textEditor =
                (InnerBeans_Inject_TextEditor) applicationContext.getBean("InnerBeans_Inject_TextEditor");
        innerBeans_inject_textEditor.checkSpell();
    }


}
