package com.tie.algorithm.dfs;

public class 재귀함수_스택프레임 {

    public static void main(String[] args) {
        dfs(3);
    }

    public static void dfs(int n) {
        if (n ==0) {
            return;
        } else {
            dfs(n - 1);
            System.out.print(n + " ");
        }
    }

}