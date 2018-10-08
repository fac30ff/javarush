package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private String address;
    private String color;
    private int age;
    private int weight;

    public Cat(String n) {
      this.name = n;
      this.color = "";
      this.age = 1;
      this.weight = 2;
    }
    public Cat(String n, int w, int a) {
      this.name = n;
      this.color = "";
      this.age = a;
      this.weight = w;
    }
    public Cat(String n, int a) {
      this.name = n;
      this.color = "";
      this.age = a;
      this.weight = 2;
    }
    public Cat(int w, String c) {
      this.color = c;
      this.age = 1;
      this.weight = w;
    }
    public Cat(int w, String c, String d) {
      this.address = d;
      this.color = c;
      this.age = 1;
      this.weight = w;
    }

    public static void main(String[] args) {

    }
}
