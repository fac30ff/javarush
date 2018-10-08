package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
       int[] arr = new int[10];

      for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(rd.readLine());
      }

      int tmp, i = 0, j = arr.length - 1;
      while (i != j + 1) {
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++;
        j--;
      }

      for (int n : arr) {
        System.out.println(n);
      }
    }
}

