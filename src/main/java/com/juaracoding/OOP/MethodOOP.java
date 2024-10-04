package com.juaracoding.OOP;

public class MethodOOP {
    public static void main(String[] args) {
        rumusPersegiPanjang objek = new rumusPersegiPanjang();
        kubus objek2 = new kubus();
        System.out.println(objek.luas(10,5));
        System.out.println(objek2.luas(10,2,3));
    }
}

class rumusPersegiPanjang {
    int luas(int panjang, int lebar){
        int panjangPersegiPanjang = panjang;
        int lebarPersegiPanjang = lebar;
        return panjangPersegiPanjang*lebarPersegiPanjang;
    }
}

class kubus extends rumusPersegiPanjang{
    int luas(int panjang,int lebar, int tinggi){
        return super.luas(panjang,lebar)*tinggi;
    }
}
