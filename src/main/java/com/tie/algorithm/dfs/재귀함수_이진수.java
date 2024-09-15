package com.tie.algorithm.dfs;

public class 재귀함수_이진수 {

    public static void main(String[] args) {
        dfs(11);
    }

    public static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

}