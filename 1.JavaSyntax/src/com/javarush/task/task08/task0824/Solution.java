package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

      Human  son = new Human("Son",true,15);
      Human  Daughter = new Human("Daughter",false,10);
      Human  Daughter2 = new Human("Daughter2",false,12);
      Human Father = new Human("Father",true,50,Daughter2, Daughter, son);
      Human  Mother = new Human("Mother",false,41, Daughter2, Daughter, son);
      Human granddad = new Human("Dad1",true,70,Mother);
      Human granddad2 = new Human("Dad2",true,68,Father);
      Human grandmother = new Human("Bab1",false,63,Mother);
      Human grandmother2 = new Human("Bab2",false,61,Father);
      System.out.println(granddad.toString());
      System.out.println(granddad2.toString());
      System.out.println(grandmother.toString());
      System.out.println(grandmother2.toString());

      System.out.println(Father.toString());
      System.out.println(Mother.toString());
      System.out.println(son.toString());
      System.out.println(Daughter.toString());
      System.out.println(Daughter2.toString());
      /*
      ArrayList<Human> children = new ArrayList<>();
      ArrayList<Human> grandFather = new ArrayList<>();
      ArrayList<Human> grandMather = new ArrayList<>();
      ArrayList<Human> father = new ArrayList<>();
      ArrayList<Human> mather = new ArrayList<>();
      ArrayList<Human> family = new ArrayList<>();


      for (int i = 0; i < 3; i++) {
        children.add(new Human("A" + i, true, i, null));
      }

      for (int i = 0; i < 2; i++) {
        grandFather.add(new Human("GrandFather" + i, true, 90, children));
      }

      for (int i = 0; i < 2; i++) {
        grandMather.add(new Human("GrandMother" + i, false, 87, children));
      }

      for (int i = 0; i < 1; i++) {
        father.add(new Human("Father", true, 34, children));
      }

      for (int i = 0; i < 1; i++) {
        mather.add(new Human("GrandMother2", false, 22, children));
      }

      for (int i = 0; i < 5 ; i++) {
        family.addAll(grandFather);
        family.addAll(grandMather);
        family.addAll(father);
        family.addAll(mather);
        family.addAll(children);
      }

      for (int i = 0; i < family.size(); i++) {
        System.out.println(family.get(i).toString());
      }*/
      /*Human s1 = new Human("f", true, 65);
      Human s2 = new Human("f", true, 65);
      Human s3 = new Human("f", true, 65);
      ArrayList<Human> list = new ArrayList<>(Arrays.asList(s1, s2, s3));
      Human father = new Human("f", true, 65, list);
      Human mother = new Human("m", false, 65, list);
      Human granpa = new Human("granpa", true, 65, new ArrayList<>(Collections.singletonList(father)));
      Human granpa1 = new Human("granpa", true, 65, new ArrayList<>(Collections.singletonList(mother)));
      Human granma = new Human("granma", false, 65, new ArrayList<>(Collections.singletonList(father)));
      Human granma1 = new Human("granma1", false, 65,new ArrayList<>(Collections.singletonList(mother)));*/


      /*Human son1 = new Human("name6", true, 7, null);
      Human son2 = new Human("name7", true, 8, null);
      Human dau = new Human("name8", false, 9, null);
      ArrayList<Human> childs = new ArrayList<>();
      childs.add(son1);
      childs.add(son2);
      childs.add(dau);

      Human dad = new Human("name4", true, 5, childs);
      ArrayList<Human> parents1 = new ArrayList<>();
      parents1.add(dad);

      Human mom = new Human("name5", false, 6, childs);
      ArrayList<Human> parents2 = new ArrayList<>();
      parents2.add(mom);


      Human gFath1 = new Human("name", true, 1, parents1);
      Human gFath2 = new Human("name1", true, 2, parents2);
      Human gMoth1 = new Human("name2", false, 3, parents1);
      Human gMoth2 = new Human("name3", false, 4, parents2);









      ArrayList<Human> humans = new ArrayList<>();
      humans.add(gFath1);
      humans.add(gFath2);
      humans.add(gMoth1);
      humans.add(gMoth2);
      humans.addAll(parents1);
      humans.addAll(parents2);
      humans.addAll(childs);

      for (int i = 0; i < humans.size(); i++) {
        humans.get(i).toString();
      }*/





    }

    public static class Human {
      private String name;
      private boolean sex;
      private int age;
      private ArrayList<Human> children = new ArrayList<>();

      public Human(String name, boolean sex, int age, Human... children) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children.addAll(Arrays.asList(children));
      }

      public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
      }

      public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
