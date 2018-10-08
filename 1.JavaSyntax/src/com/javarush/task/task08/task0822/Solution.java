package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Integer.MAX_VALUE;

      for (int i = 0; i < array.size(); i++) {
        if (array.get(i) < min) {
          min = array.get(i);
        }
      }

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
      Reader r = new InputStreamReader(System.in);
      BufferedReader rd = new BufferedReader(r);
      int N = Integer.parseInt(rd.readLine());

      for (int i = 0; i < N; i++) {
        list.add(Integer.parseInt(rd.readLine()));
      }

        return list;
    }
}
