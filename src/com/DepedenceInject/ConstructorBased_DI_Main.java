package com.DepedenceInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorBased_DI_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        ConstructorBased_DI_TextEditor constructorBased_di_textEditor =
                (ConstructorBased_DI_TextEditor) applicationContext.getBean("ConstructorBased_DI_TextEditor");
        constructorBased_di_textEditor.spellCheck();
    }
}
