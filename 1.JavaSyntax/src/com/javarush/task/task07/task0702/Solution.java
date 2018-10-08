package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];

      for (int i = 0; i < arr.length - 2; i++) {
        arr[i] = rd.readLine();
      }

      for (int i = arr.length; i > 0; i--) {
        System.out.println(arr[i - 1]);
      }

    }
}