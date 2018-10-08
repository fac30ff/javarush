package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date1.setMonth(0);
        date1.setDate(1);
        long dif = (date2.getTime() - date1.getTime())/(1000 * 60 * 60 * 24) + 1;
        return dif % 2 == 0 ? false : true;
    }
}
