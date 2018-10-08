package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

      Iterator<Cat> iter = cats.iterator();
      cats.remove(iter.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
      for (int i = 0; i < 3; i++) {
        cats.add(new Cat());
      }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
          System.out.println(cat);
        }
    }

    public static class Cat {

      Cat () {

      }
  }
    // step 1 - пункт 1
}
