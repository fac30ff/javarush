package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
      Reader r = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(r);


          while (true) {
            try {
              System.out.println(Integer.parseInt(br.readLine()));
            } catch (IOException e) {
              e.printStackTrace();
            }
          }


    }
}
