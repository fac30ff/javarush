package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
      Reader r = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(r);
      String s = br.readLine();
      StringBuilder stringVowel = new StringBuilder();
      StringBuilder stringOther = new StringBuilder();

      for (char ci : s.toCharArray()) {
        if (isVowel(ci)) {
          stringVowel.append(ci + " ");
        } else if (ci != ' '){
          stringOther.append(ci + " ");
        }
      }
      System.out.println(stringVowel.toString());
      System.out.println(stringOther.toString());

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}