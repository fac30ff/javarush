package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(System.in);
        BufferedReader rd = new BufferedReader(r);
      ArrayList<String> strings = new ArrayList<>();
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++){
            String s = rd.readLine();
            strings.add(s);
            if (s.length() < min) {

                min = s.length();
            }
        }

        for (int i = 0; i < 5; i++) {
            String s = strings.get(i);
            if (s.length() == min) {
                System.out.println(s);
            }
        }
    }
}
