package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE, a;
        int N = Integer.parseInt(reader.readLine());


          for (int i = 0; i < N; i++) {
            a = Integer.parseInt(reader.readLine());
            if (a > maximum) {
              maximum = a;
            }
          }


        //напишите тут ваш код

        System.out.println(maximum);
    }
}
