package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(rd.readLine());
        int num2 = num;
        int count = (num == 0) ? 1 : 0;
        String a = "четное ";
        String b = "нечетное ";
        String c = "";
        
        while (num != 0) {
                count++;
                num /= 10;
            }
        
        if (count == 1) {
            c = "однозначное число";
        }
        if (count == 2) {
            c = "двузначное число";
        }
        if (count == 3) {
            c = "трехзначное число";
        }
            
        
        if (num2 > 0 && num2 < 1000) {
            
            if (num2 % 2 == 0) {
                System.out.println(a + c);
            } else {
                System.out.println(b + c);
            }
        }

    }
}
