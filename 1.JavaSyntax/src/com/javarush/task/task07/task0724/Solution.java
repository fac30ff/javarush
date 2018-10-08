package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("ded1", true, 1);
        Human baba1 = new Human("baba1", false, 1);
        Human ded2 = new Human("ded2", true, 2);
        Human baba2 = new Human("baba2", false, 2);
        Human father = new Human("father", true, 3, ded1, baba1);
        Human mother = new Human("mother", false, 4, ded2, baba2);
        Human chil1 = new Human("chil1", true, 5, father, mother);
        Human chil2 = new Human("chil2", false, 6, father, mother);
        Human chil3 = new Human("chil3", true, 7, father, mother);

      System.out.println(ded1.toString());
      System.out.println(baba1.toString());
      System.out.println(ded2.toString());
      System.out.println(baba2.toString());
      System.out.println(father.toString());
      System.out.println(mother.toString());
      System.out.println(chil1.toString());
      System.out.println(chil2.toString());
      System.out.println(chil3.toString());

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;

        public Human(String name, boolean sex, int age) {
          this.name = name;
          this.sex = sex;
          this.age = age;
        }

      public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mother = mother;
        this.father = father;
      }

      public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















