package com.juaracoding;

public class Operator {
    public static void main(String[] args) {
        int a = 100;
        double b = 21.0;
        int total = a+ (int)b;
        int modulus = a%(int)b;
        boolean nol = a%(int)b==0;
        System.out.println("Total antara "+a+" + "+(int)b+ " = " +total);
        System.out.println("Sisa Hasil antara "+a+" dan "+(int)b+ " = " + modulus);
        System.out.println("Sisa Hasil antara "+a+" dan "+(int)b+ " adalah 0 = " +nol);
    }
}
