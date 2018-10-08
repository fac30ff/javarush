package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int left, top, width, height;

    public void initialize(int l, int t, int w, int h) {
      this.left = l;
      this.top = t;
      this.width = w;
      this.height = h;
    }
    public void initialize(int l, int t) {
      this.left = l;
      this.top = t;
      width = 0;
      height = 0;
    }
    public void initialize(int l, int t, int w) {
      this.left = l;
      this.top = t;
      this.width = w;
      height = width;
    }
    public void initialize(Rectangle anotherRectangle) {
    }

    public static void main(String[] args) {

    }
}
