package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top, left, width, height;

    public Rectangle(int t, int l, int w, int h) {
      this.top = t;
      this.left = l;
      this.width = w;
      this.height = h;
    }
    public Rectangle(int t, int l) {
      this.top = t;
      this.left = l;
      this.width = 0;
      this.height = 0;
    }
    public Rectangle(int t, int l, int w) {
      this.top = t;
      this.left = l;
      this.width = w;
      this.height = width;
    }
    public Rectangle(Rectangle anotherRectangle) {

    }

    public static void main(String[] args) {

    }
}
