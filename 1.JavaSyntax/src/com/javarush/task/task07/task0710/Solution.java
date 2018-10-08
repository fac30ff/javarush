package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      Reader r = new InputStreamReader(System.in);
      BufferedReader rd = new BufferedReader(r);

      ArrayList<String> str = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
        str.add(0, rd.readLine());
      }

      for (String s : str) {
        System.out.println(s);
      }

    }
}
