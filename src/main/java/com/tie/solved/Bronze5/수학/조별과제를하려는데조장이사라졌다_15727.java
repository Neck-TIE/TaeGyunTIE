package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 조별과제를하려는데조장이사라졌다_15727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());

        int result = solution(l);
        System.out.println(result);
    }

    private static int solution(int l) {
        return l % 5 == 0 ? l / 5 : (l / 5) + 1;
    }

}