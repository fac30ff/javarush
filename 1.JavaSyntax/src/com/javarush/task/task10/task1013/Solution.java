package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private boolean sex;
        private int age;
        private ArrayList<Human> parents = new ArrayList<>();
        private ArrayList<Human> children = new ArrayList<>();

        public Human() {

        }



      public Human(String name) {
        this.name = name;
      }


      public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
      }

      public Human(String name, String surname, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
      }

      public Human(String name, String surname, boolean sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
      }

      public Human(String name, String surname, boolean sex, int age, Human... children) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.children.addAll(Arrays.asList(children));
      }

      public Human(ArrayList<Human> parents, ArrayList<Human> children) {
        this.parents = parents;
        this.children = children;
      }

      public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
      }

      public Human(String name, int age) {
        this.name = name;
        this.age = age;
      }

      public Human(Human... parents) {
        this.parents.addAll(Arrays.asList(parents));
      }


      // напишите тут ваши переменные и конструкторы
    }
}
