package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
       String s = rd.readLine();
       int N = Integer.parseInt(rd.readLine());
       int i = 0;
       
       while (i < N) {
           System.out.println(s);
           i++;
       }
    }
}
