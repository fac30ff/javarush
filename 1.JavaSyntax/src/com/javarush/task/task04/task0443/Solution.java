package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String name = rd.readLine();
        int y = Integer.parseInt(rd.readLine());
        int m = Integer.parseInt(rd.readLine());
        int d = Integer.parseInt(rd.readLine());

      System.out.println("Меня зовут " + name + ".");
      System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
