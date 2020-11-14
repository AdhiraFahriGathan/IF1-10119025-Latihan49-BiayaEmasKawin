/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan49.biayaemaskawin;

import java.util.Scanner;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Biaya Emas Kawin
 */
public class IF110119025Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Emas emas = new Emas();
        System.out.println("Program Perhitungan harga Emas");
        System.out.print("Masukkan berat (gram) : ");
        emas.setTotalBerat(scan.nextDouble());
        emas.tampilHasil(emas.hitungTotal(emas.getTotalBerat()));
    }
}