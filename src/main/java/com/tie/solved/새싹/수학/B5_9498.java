package com.tie.solved.새싹.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_9498 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String grade = ratingGrade(n);
        System.out.println(grade);
    }

    private static String ratingGrade(int n) {
        if (n >= 90 && n <= 100) {
            return "A";
        } else if (n >= 80 && n < 90) {
            return "B";
        } else if (n >= 70 && n < 80) {
            return "C";
        } else if (n >= 60 && n < 70) {
            return "D";
        } else {
            return "F";
        }
    }

}