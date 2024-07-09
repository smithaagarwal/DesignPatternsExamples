package com.designpatterns.decorator;

import java.awt.*;

public class Example {
    public static void print(Camera camera) {
        System.out.println(camera.snap(new Color(125,125,125)));
    }
    public static void main(String[] args) {
        print(new Camera());
        print(new Camera(Color::brighter));
        print(new Camera(Color::darker));
        print(new Camera(Color::brighter, Color::darker));
    }
}
