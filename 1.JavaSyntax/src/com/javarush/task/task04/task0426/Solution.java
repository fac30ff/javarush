package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       String a = "отрицательное ", b = "положительное ", c = "четное число", d = "нечетное число";
       int num = Integer.parseInt(((new BufferedReader(new InputStreamReader(System.in)))
       .readLine()));
       
       if (num == 0) {
           System.out.println("ноль");
       } else {
        if (num > 0) {
           System.out.print(b);
       } else {
           System.out.print(a);
       }
       if (num % 2 == 0) {
           System.out.println(c);
       } else {
           System.out.println(d);
       }
       }
    }
}
