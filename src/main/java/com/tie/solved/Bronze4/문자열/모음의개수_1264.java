package com.tie.solved.Bronze4.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모음의개수_1264 {

    public static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine().toLowerCase();

            if (str.equals("#")) {
                break;
            }

            int answer = solution(str);

            System.out.println(answer);
        }
    }

    private static int solution(String str) {
        int answer = 0;
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            for (char vowel : vowels) {
                if (chars[i] == vowel) {
                    answer++;
                }
            }
        }

        return answer;
    }

}