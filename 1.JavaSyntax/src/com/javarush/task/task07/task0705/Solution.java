package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
       int[] bigAr = new int[20];
       int[] fiAr = new int[10];
       int[] seAr = new int[10];

      for (int i = 0; i < bigAr.length; i++) {
        bigAr[i] = Integer.parseInt(rd.readLine());
      }

      for (int i = 0; i < fiAr.length; i++) {
        fiAr[i] = bigAr[i];
      }


      for (int i = 0; i < seAr.length; i++) {

        seAr[i] = bigAr[10+i];

      }
      for (int n : seAr) {
        System.out.println(n);
      }

    }
}
