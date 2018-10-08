package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       String[] week = {"null", "понедельник", "вторник", "среда", "четверг", 
       "пятница", "суббота", "воскресенье"};
       BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
       int num = Integer.parseInt(rd.readLine());
       
       if (num > 0 && num < 8) {
           System.out.println(week[num]);
       } else {
           System.out.println("такого дня недели не существует");
       }
    }
}