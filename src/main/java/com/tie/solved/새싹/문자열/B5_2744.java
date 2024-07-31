package com.tie.solved.새싹.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        String result = caseConversion(chars);
        System.out.println(result);
    }

    private static String caseConversion(char[] chars) {
        StringBuilder sb = new StringBuilder();

        for(char c : chars) {
            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

}