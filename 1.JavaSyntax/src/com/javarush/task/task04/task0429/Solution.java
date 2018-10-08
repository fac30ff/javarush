package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int [] num = new int [3];
        int pos = 0, neg = 0;
        
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(rd.readLine());
            if (num[i] > 0) {
                pos++;
            } else if (num[i] < 0){
                neg++;
            }
        }
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);

    }
}
