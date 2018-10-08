package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Abc", "Bbc");
        map.put("Acb", "Bcb");
        map.put("Ade", "Bde");
        map.put("Aed", "Bed");
        map.put("Afg", "Bgf");
        map.put("Agf", "Bfg");
        map.put("Ahi", "Bih");
        map.put("Aih", "Bhi");
        map.put("Ajk", "Bjk");
        map.put("Akj", "Bkj");
        return (HashMap<String, String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
      int count = 0;
      if (map != null && name != null) {
          for (String mp : map.values()) {
            if (mp.equals(name)) {
              count++;
            }
          }

        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
      int count = 0;
      if (map != null && lastName != null) {
        for (String mp : map.keySet()) {
          if (mp.equals(lastName)) {
            count++;
          }
        }

      }
      return count;

    }

    public static void main(String[] args) {

    }
}
