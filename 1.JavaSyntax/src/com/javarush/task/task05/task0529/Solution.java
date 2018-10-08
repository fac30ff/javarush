package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
      int s = 0;
      while (true) {
        String a = rd.readLine();
        if (a.equals("сумма")) {
          System.out.println(s);
          break;
        }
        else {
          int i = Integer.parseInt(a);
          s = s + i;
        }
      }
      /*boolean isExit = false;
      int sum = 0, tmp;
      try {
        while (!isExit) {
          String s = rd.readLine();
          isExit = s.equals("сумма");
          tmp = Integer.parseInt(s);
          sum += tmp;
        }
      } catch (NumberFormatException e) {
        System.out.println("error");
      }
        System.out.println(sum);
*/
    }
}
