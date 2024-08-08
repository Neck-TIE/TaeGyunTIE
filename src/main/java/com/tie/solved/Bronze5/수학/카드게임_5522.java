package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 카드게임_5522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int result = solution(numbers);
        System.out.println(result);
    }

    private static int solution(int[] numbers) {
        int answer = 0;

        for (int n : numbers) {
            answer += n;
        }

        return answer;
    }

}