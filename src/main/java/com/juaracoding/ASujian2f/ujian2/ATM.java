package com.juaracoding.ASujian2f.ujian2;

import java.util.Scanner;

public class ATM {
    private double saldo;

    public ATM(double saldoAwal){
        this.saldo = saldoAwal;
    }

    public double lihatSaldo(){
        return saldo;
    }

    public double setorUang(double jumlah){
        if(jumlah>0){
            saldo+=jumlah;
        }else{
            throw new IllegalArgumentException("Jumlah uang harus lebih besar dari 0");
        }
        return jumlah;
    }

    public double tarikUang(double jumlah){
        if(jumlah>0 && jumlah<=saldo){
            saldo-=jumlah;
        }else if(jumlah>saldo){
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        }else{
            throw new IllegalArgumentException("Jumlah uang harus lebih besar dari 0");
        }
        return jumlah;
    }

    public static void main(String[] args) {
        ATM objek = new ATM(1000);
        Scanner input = new Scanner(System.in);
        System.out.println("Saldo saat ini adalah Rp"+objek.lihatSaldo());
        System.out.print("Masukkan jumlah saldo yang ingin ditambahkan = Rp");
        objek.setorUang(input.nextDouble());

        System.out.println("Saldo saat ini adalah Rp"+objek.lihatSaldo());
    }
}
