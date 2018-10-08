package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      Reader r = new InputStreamReader(System.in);
      BufferedReader rd = new BufferedReader(r);
      ArrayList<String> str = new ArrayList<>();

      for (int i = 0; i < 5; i++) {
        str.add(rd.readLine());
      }
      str.remove(2);

      for (int i = 1; i <= str.size(); i++) {
        System.out.println(str.get(str.size() - i));
      }

    }
}


