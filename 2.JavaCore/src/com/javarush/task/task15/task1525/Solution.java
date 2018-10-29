package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Paths;
/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        /*try (Scanner sc = new Scanner(new File(Statics.FILE_NAME))) {
            while (sc.hasNextLine()) {
                String s = sc.nextLine();

                if (s.length() == 0 ) {
                    continue;
                }

                lines.add(s);
            }
        } catch (FileNotFoundException e) {

        }*/
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(Statics.FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "WINDOWS-1251");
            BufferedReader reader = new BufferedReader(inputStreamReader);
            while (true) {
                String s = reader.readLine();
                if (s == null)
                    break;
                lines.add(s);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
