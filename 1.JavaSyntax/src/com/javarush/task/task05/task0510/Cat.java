package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private String address;
    private String color;
    private int age;
    private int weight;

  public void initialize(String n)
  {
    this.name = n;
    color = "";
    age = 2;
    weight = 3;

  }
  public void initialize(String n, int w, int a)
  {
    this.name = n;
    color = "";
    this.age = a;
    this.weight = w;
  }
  public void initialize(String n, int a)
  {
    this.name = n;
    color = "";
    this.age = a;
    weight = 3;
  }
  public void initialize(int w, String c)
  {
    this.color = c;
    age = 3;
    this.weight = w;
  }
  public void initialize(int w, String c, String a)
  {
    this.address = a;
    this.color = c;
    age = 3;
    this.weight = w;
  }


    public static void main(String[] args) {

    }
}
