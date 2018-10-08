package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ourCatCoefficient = this.strength * 4 + this.weight * 2 - this.age / 2;
        int anotherCatCoefficient = anotherCat.strength * 4 + anotherCat.weight * 2 - anotherCat.age / 2;
        return ourCatCoefficient > anotherCatCoefficient;
    }

    public static void main(String[] args) {

    }
}
