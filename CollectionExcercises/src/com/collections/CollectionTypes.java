package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionTypes {
    public static void main(String[] args){
        Queue<String> x= new LinkedList<>();
        x.add("one");
        x.add("two");
        x.add("one");
        System.out.println(x.poll());
    }
}
