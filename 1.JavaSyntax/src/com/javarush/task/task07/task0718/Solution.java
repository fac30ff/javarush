package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader rd = new BufferedReader(r);
        ArrayList<String> str = new ArrayList<>();

      for (int i = 0; i < 10; i++) {
          str.add(rd.readLine());

      }
      for (int i = 0; i < str.size() - 1; i++) {
        if (str.get(i).length() > str.get(i + 1).length()) {
          System.out.println(i + 1);
        }
      }


    }
}

