package com.tie.inflearn.notes;

import java.util.Scanner;

public class CalculatorRequestReader {

    public CalculatorRequest read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers and an operator (e.g 1+ 2): ");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");
        return new CalculatorRequest(parts);
    }

}