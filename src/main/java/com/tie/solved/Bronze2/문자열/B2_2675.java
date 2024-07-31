package com.tie.solved.Bronze2.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int j = 0; j < s.length(); j++) {
                int count = 0;

                while (count < n) {
                    sb.append(s.charAt(j));
                    count++;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}