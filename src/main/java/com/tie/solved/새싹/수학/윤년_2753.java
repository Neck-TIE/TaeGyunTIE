package com.tie.solved.새싹.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년_2753 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = getLeapYear(n);
        System.out.println(result);
    }

    private static int getLeapYear(int n) {
        if(n % 4 == 0) {
            if (n % 100 != 0 || n % 400 == 0) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

}