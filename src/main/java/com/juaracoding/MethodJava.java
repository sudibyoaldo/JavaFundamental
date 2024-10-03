package com.juaracoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MethodJava {
    public static void main(String[] args){
        //this way
        //String[] listkota = InputKota();
        //SortingKota(listkota);
        //or this way
        SortingKota(InputKota());
    }

    public static String[] InputKota(){
        System.out.print("Masukkan jumlah kota yang ingin di input = ");
        Scanner input = new Scanner(System.in);
        int jumlahkota = input.nextInt();
        String[] namakota = new  String [jumlahkota];
        System.out.println();
        for (int i = 0; i < jumlahkota; i++) {
            System.out.print("Masukkan kota ke-"+(i+1)+" = ");
            namakota[i] = input.next();
            //namakota[i] = namakota[i].toLowerCase();
        }
        return namakota;
    }

    public static void SortingKota(String[] listKota){
        System.out.println("Ascending Sorting");
        Arrays.sort(listKota);
        for (int i = 0; i < listKota.length ; i++) {
            System.out.println(listKota[i]);
        }

        System.out.println("Descending Sorting");
        Arrays.sort(listKota, Comparator.reverseOrder());

        for (int i = 0; i < listKota.length ; i++) {
            System.out.println(listKota[i]);
        }
    }
}


