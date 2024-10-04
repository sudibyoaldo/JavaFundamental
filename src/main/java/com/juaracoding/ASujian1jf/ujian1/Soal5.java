package com.juaracoding.ASujian1jf.ujian1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal5 {
    static int totalHargaTiketFilm = 0;
    public static void main(String[] args) {
        int[] hargaTiketFilm = {50000,60000,70000,80000,90000};
        System.out.println("Total harga tiket : "+TotalHargaTiketFilm(hargaTiketFilm));
    }
    public static int TotalHargaTiketFilm(int [] hargaTiketFilm){
        for (int i = 0; i < hargaTiketFilm.length; i++) {
            System.out.println("Harga tiket film "+(i+1)+": "+hargaTiketFilm[i]);
            totalHargaTiketFilm += hargaTiketFilm[i];
        }
        return totalHargaTiketFilm;
    }
}
