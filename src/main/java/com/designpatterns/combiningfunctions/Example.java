package com.designpatterns.combiningfunctions;

import java.util.function.Function;

public class Example {
    public static void print(int number, String message, Function<Integer, Integer> func) {
        System.out.println(number + " " + message + ":"+ func.apply(number));
    }

    static Function<Integer, Integer> inc = val -> val + 1;

    public static void main(String[] args) {
        Function<Integer,Integer> doubled = val -> val *2;
        print(5,"incremented", inc );
        print(6 ,"doubled" ,doubled );
        print(2,"incremented and doubled", inc.andThen(doubled));
    }
}
