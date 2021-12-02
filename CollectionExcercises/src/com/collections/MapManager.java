package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class MapManager {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("shiva",10);
        map.put("ramu",30);
        map.put("somu",90);
        map.put("shekhar",60);
        map.put("kamal",20);
        map.put("rajini",40);
        System.out.println(map);
        System.out.println("enter the name to be searched get key");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (map.containsKey(name)){
            Integer a = map.get(name);
            System.out.println("value for key " +name+ " is " +a);
        }
        else
        {
            System.out.println("wrong choice ");
        }
    }
}
