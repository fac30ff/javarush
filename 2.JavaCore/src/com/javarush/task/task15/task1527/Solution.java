package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<String> param = new ArrayList<>();
            for (String s : br.readLine().split("\\?")[1].split("&")) {
                String[] splitedParams = s.split("=");
                if (splitedParams[0].equals("obj")) {
                    param.add(splitedParams[1]);
                }
                System.out.println(splitedParams[0] + " ");
            }
            System.out.println();
            for (String s : param) {
                try {
                    alert(Double.parseDouble(s));
                } catch (NumberFormatException e) {
                    alert(s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
