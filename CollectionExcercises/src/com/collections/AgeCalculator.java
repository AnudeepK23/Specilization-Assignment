package com.collections;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, Month.FEBRUARY,9);
        Period p = Period.between(birthday,today);
        System.out.println("Age of person is :");
        System.out.println(p.getYears()+" years");
        System.out.println(p.getMonths()+" months");
        System.out.println(p.getDays()+" days");


    }
}
