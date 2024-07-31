package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_3003 {

    public static final int[] CHESS = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] oldChess = new int[6];
        for (int i = 0; i < 6; i++) {
            oldChess[i] = CHESS[i] - Integer.parseInt(st.nextToken());
        }

        for(int c : oldChess) {
            System.out.print(c + " ");
        }
    }
}