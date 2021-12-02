package com.collections;

import java.util.*;

public class UniqueCollection {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ram");
        arr.add("Cherry");
        arr.add("Siddhu");
        arr.add("Ram");
      //  String[] arr = {"Ram", "Cherry", "Kala", "Siddhu", "Ram"};
        System.out.println("Before Sorting :" +arr);
        LinkedHashSet<String> l = new LinkedHashSet<String>(arr);
        System.out.println("After Sorting :" );
        for(String str : l)

        System.out.println(str);
    }
}
