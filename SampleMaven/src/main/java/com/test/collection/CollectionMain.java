package com.test.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

public static void main(String[] args) {
        //TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("collectioninjection.xml");
        ProductBean prod = (ProductBean) context.getBean("ProductBean");
        System.out.println(prod);
         }

        }