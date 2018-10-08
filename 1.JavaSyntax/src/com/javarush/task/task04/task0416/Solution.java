package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble( reader.readLine() );
        System.out.println((t%5<3) ? "зелёный" : (t%5<4) ? "жёлтый" : "красный" );
    }
}