package com.collections;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataGenerator {
    public static void main(String[] args) {



        DateFormat date=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date obj=new Date();
        System.out.println(date.format(obj));
    }
}

