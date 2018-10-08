package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashName = new HashMap<>();

        hashName.put("арбуз", "ягода");
        hashName.put("банан", "трава");
        hashName.put("вишня", "ягода");
        hashName.put("груша", "фрукт");
        hashName.put("дыня", "овощ");
        hashName.put("ежевика", "куст");
        hashName.put("жень-шень", "корень");
        hashName.put("земляника", "ягода");
        hashName.put("ирис", "цветок");
        hashName.put("картофель", "клубень");

      hashName.forEach((k,v)->System.out.println(k + " - " + v));
    }
}
