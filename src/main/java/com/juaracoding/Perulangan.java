package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        int tinggi = 5;

        System.out.println("Segitiga siku kiri =");
        for(int i=0;i<tinggi;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Segitiga siku kiri kebalik =");
        for(int i=0;i<tinggi;i++){
            for (int j = tinggi; j >i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Segitiga siku kanan =");
        for(int i=0;i<tinggi;i++){
            for (int k = tinggi; k >i ; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Segitiga siku kanan terbalik =");
        for(int i=0;i<tinggi;i++){
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = tinggi; k >i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        int bintang = 1;
        System.out.println("Segitiga sama sisi = ");
        for (int i = 0; i < tinggi; i++) {
            for (int j = tinggi-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <bintang ; k++) {
                System.out.print("*");
            }
            bintang+=2;
            System.out.println("");
        }

        bintang = (tinggi*2)-1;
        System.out.println("Segitiga sama sisi terbalik = ");
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = bintang; k>i; k--) {
                System.out.print("*");
            }
            bintang-=1;
            System.out.println("");
        }

        Scanner input = new Scanner(System.in);
        int login = 3;
        while(true){
            System.out.print("Masukkan username = ");
            String uname = input.nextLine();
            System.out.print("Masukkan password = ");
            String pass = input.nextLine();

            if (uname.equalsIgnoreCase("Login") && pass.equalsIgnoreCase("Password")){
                System.out.println("Berhasil Login");
                break;
            }else {
                System.out.println("Username atau Password Salah , Silahkan coba lagi");
                login-=1;
                System.out.println("Kesempatan Login = "+login);
                if (login<1){
                    break;
                }
            }

        }
    }
}
