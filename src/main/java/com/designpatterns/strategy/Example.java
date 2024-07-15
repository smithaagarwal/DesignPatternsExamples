package com.designpatterns.strategy;

import java.util.List;

public class Example {
    public static int totalValues(List<Integer> numbers) {
        int total = 0;
        for(int i:numbers) {
            total += i;
        }
        return total;
    }

    public static int totalEvenValues(List<Integer> numbers) {
        int total = 0;
        for(int i:numbers) {
            if(i%2==0)
                total += i;
        }
        return total;
    }

    public static int totalOddValues(List<Integer> numbers) {
        int total = 0;
        for(int i:numbers) {
            if(i%2==0)
                total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(totalValues(numbers));
        System.out.println(totalEvenValues(numbers));
        System.out.println(totalOddValues(numbers));
    }
}
