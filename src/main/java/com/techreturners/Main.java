package com.techreturners;

public class Main {
    public static void main(String[] args) {
    int value = 4 ;
    if (value>4 && LazyEvaluation.compute(value)>100) {
        System.out.println("Path 1");
    } else {
        System.out.println("Path 2");
    }

    }
}