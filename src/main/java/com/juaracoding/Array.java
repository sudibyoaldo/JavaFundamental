package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah kota yang ingin di input = ");
        int jumlahkota = input.nextInt();
        String[] namakota = new  String [jumlahkota];
        System.out.println();
        for (int i = 0; i < jumlahkota; i++) {
            System.out.print("Masukkan kota ke-"+(i+1)+" = ");
            namakota[i] = input.next();
            namakota[i] = namakota[i].toLowerCase();
        }

        System.out.print("Masukkan nama kota yang ingin di cari = ");
        String carikota = input.next();
        carikota = carikota.toLowerCase();
        int index = Arrays.binarySearch(namakota, carikota);
        index+=1;
        System.out.println("Kota "+carikota+" ada di urutan ke-"+(index));
    }
}
