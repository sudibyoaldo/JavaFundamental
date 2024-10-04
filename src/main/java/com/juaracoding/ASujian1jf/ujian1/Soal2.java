package com.juaracoding.ASujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    static Scanner input = new Scanner(System.in);;
    public static void main(String[] args) {
        String namaFilm;
        System.out.print("Masukkan nama film: ");
        namaFilm = input.nextLine();
        System.out.println("Nama film dalam huruf besar: "+UpperCase(namaFilm));
    }
    public static String UpperCase (String namaFilm){
        return namaFilm.toUpperCase();
    }
}
