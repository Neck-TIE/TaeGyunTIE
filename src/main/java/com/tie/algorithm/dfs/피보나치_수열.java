package com.tie.algorithm.dfs;

public class 피보나치_수열 {

    static int[] fibo;

    public static void main(String[] args) {
        int n = 10;
        fibo = new int[n + 1];
        dfs(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static int dfs(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }

        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = dfs(n - 2) + dfs(n - 1);
        }
    }

}