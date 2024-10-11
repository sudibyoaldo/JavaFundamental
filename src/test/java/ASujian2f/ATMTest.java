package ASujian2f;

import com.juaracoding.ASujian2f.ujian2.ATM;
import org.testng.annotations.*;


public class ATMTest {
    ATM objek;
    @BeforeMethod
    @Parameters("saldoAwal")
    public void initateObject(double saldoAwal){
        objek = new ATM(saldoAwal);
    }

    @AfterMethod
    public void testLihatSaldo(){
        System.out.println();
        System.out.println("Saldo saat ini adalah Rp"+objek.lihatSaldo());
    }

    @Test(priority = 1)
    public void testSetorUang(){
        double nominalSetorUang = 100000.0;
        System.out.print("Test Setor Uang dengan nominal = Rp"+objek.setorUang(nominalSetorUang));
    }

    @Test(priority = 2)
    public void testSetorUangNegatif(){
        double nominalSetorUangNegatif = -10.0;
        System.out.print("Test Setor Uang dengan nominal negatif = Rp"+nominalSetorUangNegatif);
        System.out.println(objek.setorUang(nominalSetorUangNegatif));
    }

    @Test(priority = 3)
    public void testTarikUang(){
        double nominalTarikUang = objek.lihatSaldo();
        System.out.print("Test Tarik Uang dengan nominal = Rp"+objek.tarikUang(nominalTarikUang));
    }

    @Test(priority = 4)
    public void testTarikUangLebihDariSaldo(){
        double nominalTarikUangLebihDariSaldo = objek.lihatSaldo()*2;
        System.out.print("Test Tarik Uang Lebih Dari Saldo = Rp"+nominalTarikUangLebihDariSaldo);
        System.out.println(objek.tarikUang(nominalTarikUangLebihDariSaldo));
    }

    @Test(priority = 5)
    public void testTarikUangNegatif(){
        double nominalTarikUangNegatif = -10.0;
        System.out.print("Test Tarik Uang dengan nominal = Rp"+nominalTarikUangNegatif);
        System.out.println(objek.tarikUang(nominalTarikUangNegatif));
    }
}
