package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    Cat() {
      Cat.catCount += 1;
    }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    Cat.catCount -= 1;
  }

  //напишите тут ваш код

    public static void main(String[] args) {

    }
}