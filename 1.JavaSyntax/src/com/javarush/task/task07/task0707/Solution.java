package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
         list.add("a");
         list.add("b");
         list.add("c");
         list.add("d");
         list.add("e");
      System.out.println(list.size());

         for (String x : list) {
           System.out.println(x);
         }


    }
}