/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan19.saldotabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deakripsi Program : Program ini berisi program untuk menghitung saldo tabungan
 *                     pada tiap bulannya.
 */
public class PBOIF210119058Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal,bunga,total,totalBunga;
        int lamaMenabung,i;
        
        saldoAwal = 2500000;
        bunga     = 0.15;
        lamaMenabung = 6;
        i = 1;
    
        
        do{
            totalBunga = saldoAwal*bunga;
            total      = totalBunga + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i +" Rp. %,1.0f%n", total);
            saldoAwal += totalBunga;
            i++;
        }while (i <= lamaMenabung);
       
       }
        
}
