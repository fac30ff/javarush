package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      Reader r = new InputStreamReader(System.in);
      BufferedReader rd = new BufferedReader(r);
      ArrayList<String> str = new ArrayList<>();

      for (int i = 0; i < 5; i++) {
        str.add(rd.readLine());
      }

      for (int i = 0; i < 13; i++) {
        str.add(0, str.get(str.size() - 1));
        str.remove(str.size() - 1);
      }

      for (String s: str) {
        System.out.println(s);
      }

    }
}
