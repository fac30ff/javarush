package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(rd.readLine());
        }
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                }
            }
        }
        
            System.out.println(num[1]);
        
    }
}
