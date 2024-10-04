package com.juaracoding.ASujian1jf.ujian1;

import java.util.Calendar;
import java.util.Scanner;

public class Soal3 {
    static Scanner input = new Scanner(System.in);;
    public static void main(String[] args) {
        DiskonTiket();
    }
    public static void DiskonTiket(){
        int jumlahTiket;
        double diskon;
        int hargaTiket;
        int totalHargaTiket;
        boolean weekend;

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        weekend = (dayOfWeek==1 || dayOfWeek==7) ? true : false;
        hargaTiket = weekend ? 45000:35000;

        System.out.print("Jumlah tiket: ");
        jumlahTiket = input.nextInt();
        diskon = (jumlahTiket>5) ? 0.1 : 0.0;
        totalHargaTiket = hargaTiket*jumlahTiket;
        totalHargaTiket = (int) (totalHargaTiket-(totalHargaTiket*diskon));
        System.out.println("Total harga (dengan diskon): "+totalHargaTiket);
    }
}
