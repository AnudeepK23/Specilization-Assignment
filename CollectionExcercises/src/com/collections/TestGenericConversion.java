package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestGenericConversion {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("one");
        //  list.add(2);
        System.out.println(list.get(0).length());
    }
}
