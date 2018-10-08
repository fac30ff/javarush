package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
      for (int i = 0; i < 10; i++) {
        map.put("name" + i, 100 * i);
      }
      return (HashMap<String, Integer>) map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
      HashMap<String, Integer> copy = new HashMap<>(map);
      for (Map.Entry<String, Integer> pair : copy.entrySet()) {
        if (pair.getValue() < 500)
          map.remove(pair.getKey());
      }

    }

    public static void main(String[] args) {

    }
}