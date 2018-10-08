package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true) {

          String city = reader.readLine();
          if (city.isEmpty()) {
            break;
          }
            String family = reader.readLine();
            if (family.isEmpty()) break;


            addresses.add(city);
            addresses.add(family);
        }

        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());
      String cityLiving = reader.readLine();
      for (int i = 0; i < addresses.size(); i += 2) {
        if (addresses.get(i).equals(cityLiving)) {
          System.out.println(addresses.get(i + 1));
        }
      }

        /*if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
    }
}
