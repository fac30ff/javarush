package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("name", 1);

    }

    static class Person {
        private String name;
        private int age;

      public void initialize(String n, int a) {
        this.name = n;
        this.age = a;
      }

    }


}
