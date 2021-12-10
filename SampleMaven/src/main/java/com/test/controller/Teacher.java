package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Teacher {
    @Autowired
    private Address teachAddress;
    public void setTeachAddress(Address teachAddress)
    {
        this.teachAddress=teachAddress;

    }
    public Address getTeachAddress() {
        return teachAddress;
    }
}
