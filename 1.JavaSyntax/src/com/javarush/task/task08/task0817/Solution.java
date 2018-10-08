package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
      int count;
      List<String> list = new ArrayList<>(map.values());

      for (String str : list) {
        count = 0;
        for (String str2 : list) {
          if (str.equals(str2)) {
            count++;
            if (count > 1) {
              removeItemFromMapByValue(map, str);
            }
          }

        }
      }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
