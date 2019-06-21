package com.DepedenceInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjection_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        CollectionInjection_JavaCollection collectionInjection_javaCollection =
                (CollectionInjection_JavaCollection) applicationContext.getBean("CollectionInjection_JavaCollection");

        collectionInjection_javaCollection.getAddressList();
        collectionInjection_javaCollection.getAddressSet();
        collectionInjection_javaCollection.getAddressMap();
        collectionInjection_javaCollection.getAddressProperties();
        collectionInjection_javaCollection.getAddress();
        collectionInjection_javaCollection.getEmail();
    }
}
