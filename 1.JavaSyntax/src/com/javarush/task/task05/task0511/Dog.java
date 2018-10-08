package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize(String n){
      this.name = n;
    }
    public void initialize(String n, int h){
      this.name = n;
      this.height = h;
    }
    public void initialize(String n, int h, String c){
      this.name = n;
      this.height = h;
      this.color = c;
    }

    public static void main(String[] args) {

    }
}
