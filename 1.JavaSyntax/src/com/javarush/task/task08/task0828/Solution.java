package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

      Reader r = new InputStreamReader(System.in);
      BufferedReader rd = new BufferedReader(r);
      String str = rd.readLine();

      for (Map.Entry<String, Integer> pair : map.entrySet()) {
        String key = pair.getKey();
        Integer value = pair.getValue();
        if (key.equals(str)) {
          System.out.println(key + " is " + value + " month");
        }
      }

      /*map.forEach((key, value) -> {if (key.equals(str)) {
        System.out.println(key + " is " + value + " month");
      }});*/

    }
}
