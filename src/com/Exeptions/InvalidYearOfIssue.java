package com.Exeptions;

public class InvalidYearOfIssue extends RuntimeException {
    public InvalidYearOfIssue() {
    }

    public InvalidYearOfIssue(String message) {
        super(message);
    }
}