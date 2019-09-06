package com.company;

public class DoubleArray {
    Character array[][];
    private int size;
    private String cipher = "";

    public DoubleArray(int sizeMatrix, String text) {

        size = sizeMatrix;
        array = new Character[size][size];
        char arr[] = text.toCharArray();

        for (int i = 0, k = 0; i < size; i++) {
            for (int j = 0; j < size; j++, k++) {
                array[i][j] = '.';

                if (k < arr.length) {
                    array[i][j] = arr[k];
                }
            }
        }

    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String convert() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[j][i] != '.') {
                    cipher += array[j][i];
//                    System.out.print(array[j][i]);
                }
            }
        }

        return cipher;
    }

    public String deconverter(int withKey, String str) {

        return "";
    }
}
