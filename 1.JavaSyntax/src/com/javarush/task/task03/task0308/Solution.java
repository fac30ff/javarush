package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1, i = 1;
        while (i < 11) {
            a *= i;
            i++;
        }
        System.out.println(a);//напишите тут ваш код
    }
}
