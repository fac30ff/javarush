package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(System.in);
        BufferedReader rd = new BufferedReader(r);
      int max = 0;
      for (int i=0;i<5;i++){
        String s = rd.readLine();
        strings.add(s);
        if (s.length() > max) {
          //ищем самую длинную строку в списке
          max = s.length();
        }
      }

      for (int i = 0; i < 5; i++) {
        String s = strings.get(i);
        if (s.length() == max) {
          System.out.println(s);
        }
      }






    }
}
