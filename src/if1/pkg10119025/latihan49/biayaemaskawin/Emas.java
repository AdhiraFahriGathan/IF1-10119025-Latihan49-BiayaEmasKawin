/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan49.biayaemaskawin;

/**
 *
 * @author User
  * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Biaya Emas Kawin
 */
public class Emas {
    private static double harga = 570000;
    private double totalBerat;

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public double getTotalBerat() {
        return totalBerat;
    }

    public double hitungTotal(double totalBerat){
        return harga * totalBerat;
    }

    public void tampilHasil(double totalHarga){
        System.out.println("harga emas : "+harga);
        System.out.println("total harga : "+totalHarga);
    }
}
