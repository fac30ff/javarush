package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1981"));
        map.put("Stallone2", new Date("JUNE 1 1982"));
        map.put("Stallone3", new Date("JUNE 1 1983"));
        map.put("Stallone4", new Date("JUNE 1 1984"));
        map.put("Stallone5", new Date("JUNE 1 1985"));
        map.put("Stallone6", new Date("JUNE 1 1986"));
        map.put("Stallone7", new Date("JUNE 1 1987"));
        map.put("Stallone8", new Date("JUNE 1 1988"));
        map.put("Stallone9", new Date("JUNE 1 1989"));

        return map;



    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

      Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

      while (iter.hasNext()) {
        Map.Entry<String, Date> entry = iter.next();
        if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
          iter.remove();
        }
      }

    }

    public static void main(String[] args) {

    }
}
