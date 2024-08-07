package com.tie.solved.새싹.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 검증수_2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = st.countTokens();
        int[] numbers = new int[length];
        for(int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int result = solution(numbers);

        System.out.println(result);
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        for (int number : numbers) {
            answer += (number * number);
        }

        return answer % 10;
    }

}