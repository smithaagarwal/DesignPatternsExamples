package com.techreturners;

import java.util.function.Supplier;

public class Lazy<T> {
    private T instance;
    private Supplier<T> supplier;

    //public Lazy (T value) { //this way would be eager
    public  Lazy (Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if(instance==null)
            instance = supplier.get();
        return instance;
    }
}
