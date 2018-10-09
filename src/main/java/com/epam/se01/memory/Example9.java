package com.epam.se01.memory;

import java.util.Date;

public class Example9 {

    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println("Before:" + myDate.getDate());
        changeDate(myDate);
        System.out.println("After:" + myDate.getDate());
    }

    public static void changeDate(Date date) {
        System.out.println("	- before change: "+ date.getDate());
        date.setDate(12);
        System.out.println("	- after change: " + date.getDate());
    }

}


