package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Shares_3733 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String cur = br.readLine();

            if (cur == null) {
                break;
            }

            StringTokenizer st = new StringTokenizer(cur);
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            System.out.println(s / (n + 1));
        }
    }

}