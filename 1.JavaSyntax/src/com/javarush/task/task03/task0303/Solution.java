package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 0.83));
        System.out.println(convertEurToUsd(15, 0.85));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur*course;
        return usd;//напишите тут ваш код
    }
}
