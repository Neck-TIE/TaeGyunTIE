package com.tie.solved.Bronze4.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_2083 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (s.equals("# 0 0")) {
                break;
            }

            String result = memberClassification(s);
            System.out.println(result);
        }
    }

    private static String memberClassification(String s) {
        String[] str = s.split(" ");

        String name = str[0] + " ";
        int age = Integer.parseInt(str[1]);
        int weight = Integer.parseInt(str[2]);

        if (age > 17 || weight >= 80) {
            return name + "Senior";
        }

        return name + "Junior";
    }

}