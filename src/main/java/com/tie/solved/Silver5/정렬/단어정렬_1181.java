package com.tie.solved.Silver5.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class 단어정렬_1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        String[] result = solution(words);

        for (String word : result) {
            System.out.println(word);
        }
    }

    private static String[] solution(String[] words) {
        Set<String> wordSet = new LinkedHashSet<>(Arrays.asList(words));
        String[] uniqueWords = wordSet.toArray(new String[0]);

        Arrays.sort(uniqueWords, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });

        return uniqueWords;
    }

}