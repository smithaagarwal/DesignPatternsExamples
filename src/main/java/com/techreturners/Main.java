package com.techreturners;

public class Main {
    public static void main(String[] args) {
    int value = 4 ;
    int temp = LazyEvaluation.compute(value); //eager evaluation, function is evaluated when its called. It does't wait to see if the value from the function is used eventually or not
    if (value>4 && temp >100) {
        System.out.println("Path 1 with " + temp);
    } else {
        System.out.println("Path 2");
    }

    }
}