package com.tie.algorithm.dfs;

public class 팩토리얼 {

    public static void main(String[] args) {
        int result = dfs(5);
        System.out.println(result);
    }

    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dfs(n - 1);
        }
    }

}