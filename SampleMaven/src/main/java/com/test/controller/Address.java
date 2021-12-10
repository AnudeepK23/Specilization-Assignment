package com.test.controller;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Address {
    private String city = "Chennai";
    public Address() {
        System.out.println("My city:" + city);
    }
    public void setCity(String city)
    {
        this.city=city;

    }
    public String getCity() {
        return city;
    }
}