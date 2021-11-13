/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry;

import java.util.Scanner;
import ukl.laundry.data.Client;
import ukl.laundry.data.Petugas;
import ukl.laundry.data.JenisLaundry;
import ukl.laundry.proses.Laporan;
import ukl.laundry.proses.Transaksi;

/**
 * @author FahrezaDityaAlfandry
 */
public class UKLLaundry {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        boolean cek = true;
        Scanner sc = new Scanner(System.in);
        
        while (cek) { //mengulang program
            JenisLaundry aa = new JenisLaundry();
            Client bb = new Client();
            Petugas cc = new Petugas();
            Transaksi dd = new Transaksi();
            Laporan ee = new Laporan();
        
            ee.laporan(bb);
            ee.laporan(aa);
            System.out.println();
            dd.proses(bb, dd, aa);
            System.out.println();
            ee.laporan(cc);
            ee.laporan(dd, aa);
            
            System.out.print("\n\nUlang (1)\nKeluar (99)\n=> ");
            int pilih = sc.nextInt();
            if (pilih == 1){
                cek = true;
            }else if (pilih == 99){
                cek = false;
            }else {
                System.out.println("\n\n///=== EROR ===///");
                cek = false;
            }
        }
        
    }
}
