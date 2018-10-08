package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
      int[] street = new int[15];
      int sum1 = 0, sum2 = 0;

      for (int i = 0; i < street.length; i++) {
        street[i] = Integer.parseInt(rd.readLine());
        if (i % 2 == 0) {
          sum1 += street[i];
        } else {
          sum2 += street[i];
        }
      }

      if (sum1 > sum2) {
        System.out.println("В домах с четными номерами проживает больше жителей.");
      } else {
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
      }



    }
}
