package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> setName = new HashSet<>();
      setName.add("арбуз");
      setName.add("банан");
      setName.add("вишня");
      setName.add("груша");
      setName.add("дыня");
      setName.add("ежевика");
      setName.add("жень-шень");
      setName.add("земляника");
      setName.add("ирис");
      setName.add("картофель");

      for (String sn : setName) {
        System.out.println(sn);
      }

    }
}
