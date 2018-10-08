package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader rd = new BufferedReader(r);

      ArrayList<Integer> list = new ArrayList<>();
      int max = 1, count = 1;



      for (int i = 0; i < 10; i++) {
        list.add(Integer.parseInt(rd.readLine()));
      }
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) == list.get(i + 1)) {
          count++;
          if (max < count) {
            max = count;
          }
        } else {
          count = 1;
        }
      }
      System.out.println(max);





    }
}