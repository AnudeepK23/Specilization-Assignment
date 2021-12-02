package com.collections;

import java.util.HashSet;

public class Test {
    public static void main(String[] args){
        Integer a = new Integer(4);
        Integer b = new Integer(8);
        Integer c = new Integer(4);
        Integer d = new Integer(12);
        HashSet hs = new HashSet();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        hs.add(d);
        System.out.println(hs);


    }
}
