package com.company;

public class Main {

    public static void main(String[] args) {
	BlackBox obj1 = new BlackBox(10,15);
        BlackBox obj2 = new BlackBox(10,15);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
