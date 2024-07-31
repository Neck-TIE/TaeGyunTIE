package com.tie.solved.Bronze3.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈_2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String num2 = br.readLine();

        int[] answer = solution(num1, num2);
        for (int result : answer) {
            System.out.println(result);
        }
    }

    private static int[] solution(String num1, String num2) {
        int[] answer = new int[4];

        int number = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int[] numbers = new int[3];
        String[] str = num2.split("");

        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        answer[0] = number * numbers[2];
        answer[1] = number * numbers[1];
        answer[2] = number * numbers[0];
        answer[3] = number * number2;

        return answer;
    }

}