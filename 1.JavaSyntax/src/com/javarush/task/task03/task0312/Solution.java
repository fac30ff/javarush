package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static void main(String[] args) {
        int a = convertToSeconds(12);
        int b = convertToSeconds(7);
        System.out.println(a);
        System.out.println(b);//напишите тут ваш код
    }
    
    public static int convertToSeconds(int h) {
        int seconds = h * 60 * 60;
        return seconds;
    }
}
