package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
   private String name;
   private int height;
   private String color;

   public Dog(String n) {
     this.name = n;
   }
   public Dog(String n, int h) {
     this.name = n;
     this.height = h;
   }
   public Dog(String n, int h, String c) {
     this.name = n;
     this.height = h;
     this.color = c;
   }

    public static void main(String[] args) {

    }
}
