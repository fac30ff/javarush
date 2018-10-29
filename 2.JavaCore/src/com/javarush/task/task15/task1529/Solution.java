package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        Solution.reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            if (s.equals("helicopter")) {
                result = new Helicopter();
            }
            if (s.equals("plane")) {
                int n = Integer.parseInt(br.readLine());
                result = new Plane(n);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
