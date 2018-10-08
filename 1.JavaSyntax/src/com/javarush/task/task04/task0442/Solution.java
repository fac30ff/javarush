package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = 0, summ = 0;
        
        while (n != -1) {
            n = Integer.parseInt(rd.readLine());
            summ += n;
        }

        System.out.println(summ);
        
    }
}
