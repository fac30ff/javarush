package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      Reader r = new InputStreamReader(System.in);
      BufferedReader rd = new BufferedReader(r);
      int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, indMin = 0, indMax = 0;
      ArrayList<String> str = new ArrayList<>();

      for (int i = 0; i < 10; i++) {
        str.add(rd.readLine());
        if (max < str.get(i).length()) {
          max = str.get(i).length();
          indMax = i;
        }
        if (min > str.get(i).length()) {
          min = str.get(i).length();
          indMin = i;
        }


      }

      if (indMax > indMin) {
        System.out.println(str.get(indMin));
      } else {
        System.out.println(str.get(indMax));
      }


    }
}
