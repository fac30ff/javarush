package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] abc = new int[3];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = Integer.parseInt(((new BufferedReader(new InputStreamReader(System.in))).readLine()));
            }
        for (int i = 0; i < abc.length; i++) {
            if ((abc[(i % 3)] != abc[(i + 1) % 3]) & (abc[(i + 1) % 3] == abc[(i + 2) % 3])) {
                System.out.println(i + 1);
            }
        }
    }
}
