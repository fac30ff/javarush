package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(System.in);
        BufferedReader rd = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
          list.add(rd.readLine());
      }

        ArrayList<String> result = doubleValues(list);
        for (String re : result) {
          System.out.println(re);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {

      for (int i = 0; i < list.size(); i++) {
        list.add(i + 1, list.get(i));
        i++;
      }


      //напишите тут ваш код
        return list;
    }
}
