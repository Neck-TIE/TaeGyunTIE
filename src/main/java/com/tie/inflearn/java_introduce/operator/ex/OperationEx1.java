package com.tie.inflearn.java_introduce.operator.ex;

public class OperationEx1 {

    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num + num2 + num3;
        int average = sum / 3; // int 끼리의 나눗셈은 자동으로 소수점 이하를 버림

        System.out.println(sum);
        System.out.println(average);
    }

}