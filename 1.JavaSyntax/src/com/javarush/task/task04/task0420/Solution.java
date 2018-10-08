package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        int b = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());
        
        System.out.print((a>b?(a>c?a:c):(b>c?b:c)) + " ");
        System.out.print((a>b?(a<c?a:(c>b?c:b)):(b<c?b:(a>c?a:c))) + " ");
        System.out.print(a<b?(a<c?a:c):(b<c?b:c));
    }
}
