package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] arrInt = new int[10];
        String[] arrStr = new String[10];

      for (int i = 0; i < arrStr.length; i++) {
        arrStr[i] = rd.readLine();
        arrInt[i] = arrStr[i].length();
        System.out.println(arrInt[i]);
      }

    }
}
