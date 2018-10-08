package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double bmi = weight / (height * height);
            if (bmi < 18.5) {
              System.out.println("Недовес: меньше чем 18.5");
            }
            if (bmi >= 18.5 && bmi < 25 ) {
              System.out.println("Нормальный: между 18.5 и 24.9");
            }
            if (bmi >= 25 && bmi < 30) {
              System.out.println("Избыточный вес: между 25 и 29.9");
            }
            if (bmi >= 30) {
              System.out.println("Ожирение: 30 или больше");
            }

        }
    }
}