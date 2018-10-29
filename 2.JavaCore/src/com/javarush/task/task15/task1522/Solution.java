package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
    
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        String s = "";
        try (Scanner sc = new Scanner(System.in)) {
            s = sc.nextLine();
        }
        if (s.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        }
         else if (s.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        }
        else if (s.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else {
            thePlanet = null;
        }
        
    }
}
