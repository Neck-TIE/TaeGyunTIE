package com.tie.solved.Bronze5.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아_4999 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        String result = compare(str1, str2);
        System.out.println(result);
    }

    public static String compare(String str1, String str2) {
        int a = 0;
        int h = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a') {
                a++;
            } else if (str1.charAt(i) == 'h') {
                break;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a') {
                h++;
            } else if (str2.charAt(i) == 'h') {
                break;
            }
        }

        return a >= h ? "go" : "no";
    }

}