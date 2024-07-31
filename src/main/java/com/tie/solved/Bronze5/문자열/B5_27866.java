package com.tie.solved.Bronze5.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());

        char c = str.charAt(i - 1);
        System.out.println(c);
    }

}