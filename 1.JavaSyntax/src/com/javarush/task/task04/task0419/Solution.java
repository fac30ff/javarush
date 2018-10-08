package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        int b = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());
        int d = Integer.parseInt(rd.readLine());
        
        int temp = max(a, b);
        int temp2 = max(c, d);
        int res = max(temp, temp2);
        
        System.out.println(res);
        
    }
    
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    
}
