/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS.IF10K.NIM10119907.TDoni.no2;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk uts no 2
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.println("Masukan Saldo Awal : ");
        var saldoAwal = scanner.nextInt();
        var tabungan = new Tabungan(saldoAwal);
        
        System.out.println("Jumlah Uang Yang Diambil : ");
        var tarik = scanner.nextInt();
        var sisa = tabungan.ambilUang(tarik);
        System.out.println("Saldo Anda Sekarang : ".concat(Integer.toString(sisa)));
    }
}
