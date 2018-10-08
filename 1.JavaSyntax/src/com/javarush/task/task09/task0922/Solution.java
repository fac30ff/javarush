package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
      Reader r = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(r);
      String s = br.readLine();
      Date d = new Date(s);
      SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
      String newFD = sdf.format(d);

      System.out.println(newFD.toUpperCase());

    }
}
