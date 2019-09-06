package com.company;

public class Main {

    public static void main(String[] args) {

//        if (!args[0].isEmpty()) {
//            System.out.println(args[0]);
//        }
        DoubleArray array = new DoubleArray(4,"MatherFucker");
        array.printMatrix();
        System.out.println(array.convert());
        array.deconverter(4, "MecarktFehur");
        array.printMatrix();
    }
}
