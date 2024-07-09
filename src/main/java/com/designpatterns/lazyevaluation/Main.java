package com.designpatterns.lazyevaluation;

public class Main {
    public static void main(String[] args) {
        int value = 41;
        //int temp = Example.compute(value); //eager evaluation, function is evaluated when its called. It does't wait to see if the value from the function is used eventually or not
        Lazy<Integer> temp = new Lazy<Integer>(()->Example.compute(value)); //lazy evaluation
        if (value > 4 && temp.get() > 100) {
            System.out.println("Path 1 with " + temp.get());
        } else {
            System.out.println("Path 2");
        }

    }
}

/* David Wheeler:
In CS we can solve almost any problem by introducing one more level of indirection

In procedural code, pointer gave the power of indirection
In OO code , overriding functions gave the power of indirection
In functional programming Lamdas give the power of indirection
 */