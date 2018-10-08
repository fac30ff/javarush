package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public Friend(String s) {
      this.name = s;
    }
    public Friend(String s, int a) {
      this.name = s;
      this.age = a;
    }
    public Friend(String n, int a, char s) {
      this.name = n;
      this.age = a;
      this.sex = s;
    }

    public static void main(String[] args) {

    }
}
