package com.juaracoding.ASujian1jf.ujian1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
    static Scanner input = new Scanner(System.in);
    static int jumlahFilm = 5;

    public static void main(String[] args) {
        String [] namaFilm = DaftarFilm();
        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < jumlahFilm; i++) {
            System.out.println((i+1)+". "+namaFilm[i]);
        }
    }

    public static String[] DaftarFilm(){
        System.out.println("Daftar film bioskop");
        String[] namaFilm = new  String [jumlahFilm];
        for (int i = 0; i < jumlahFilm; i++) {
            System.out.print("Masukkan nama film "+(i+1)+": ");
            namaFilm[i] = input.nextLine();
        }
        return namaFilm;
    }
}
