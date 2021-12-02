package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListManager0 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Boss");
        list1.add("Thank");
        System.out.println("List1 elements :"+list1);
        List<String> list2 = new ArrayList<>();

        list2.add("Boss");
        list2.add("Friend");
        System.out.println("List2 elements :"+list2);

        //System.out.println("Total elements :"+list2);
        list1.removeAll(list2);
        System.out.println("After removing Elements:"+list1);


    }
}

