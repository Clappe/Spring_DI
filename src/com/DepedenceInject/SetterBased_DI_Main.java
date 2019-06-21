package com.DepedenceInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterBased_DI_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        SetterBased_DI_TextEditor setterBased_di_textEditor =
                (SetterBased_DI_TextEditor) applicationContext.getBean("SetterBased_DI_TextEditor");
        setterBased_di_textEditor.spellCheck();
    }
}
