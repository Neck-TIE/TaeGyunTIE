package com.tie.inflearn.notes;

public class InvalidOperatorException extends RuntimeException {

    public InvalidOperatorException() {
        super("Invalid operator, you need to choose one of (+, -, *, /)");
    }

}