package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double count = -1;
        double res;
        double n = 0, sum = 0;

        while (n != -1) {
          sum += n;
          count++;

          n = Double.parseDouble(rd.readLine());

        }

        res = sum / count;
      System.out.println(res);

    }
}

