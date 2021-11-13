/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry.proses;

import java.util.ArrayList;
import java.util.Scanner;
import ukl.laundry.data.JenisLaundry;
import ukl.laundry.data.Client;

/**
 *
 * @author FahrezaDityaAlfandry
 */
public class Transaksi {
    
    private ArrayList<Integer> idLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    
    public void proses(Client client, Transaksi transaksi, JenisLaundry jenisLaundry){ //inputan user, melakukan transaksi
        Scanner in = new Scanner(System.in);
        System.out.println("\n=== Laundry ===");
        System.out.print("Masukkan ID Client\n=> ");
        int idClienet = in.nextInt();
        System.out.println("\nSelamat datang "+client.getNama(idClienet));
        int x = 0;
        int end = 0;
        do{
            System.out.print("Pilih jenis laundry (99 untuk berhenti)\n=> ");
            end = in.nextInt();
            if (end != 99){
                idLaundry.add(end);
                System.out.print(jenisLaundry.getJenis(idLaundry.get(x))+" sebanyak(kg)\n=> ");
                banyak.add(in.nextInt());
                x++;
            }
        }while (end != 99);
        System.out.println("\n=== Transaksi "+client.getNama(idClienet)+" ==="); // menampilkan data transaksi
        System.out.println("Nama Barang\tBanyak(kg)\tHarga\t  Jumlah");
        int total = 0;
        int y = idLaundry.size();
        for (int a = 0; a < x; a++) {
            int jumlah = banyak.get(a) * jenisLaundry.getHarga(idLaundry.get(a));
            total += jumlah;
            System.out.println(jenisLaundry.getJenis(idLaundry.get(a))+"\t"+banyak.get(a)+"\t\t"
                    +jenisLaundry.getHarga(idLaundry.get(a))+"/kg\t  "+jumlah);
            transaksi.setTransaksi(jenisLaundry, idClienet, idLaundry.get(a), banyak.get(a));
        }

        System.out.println("\nTotal Laundry\t: " + total);
        client.editSaldo(idClienet, client.getSaldo(idClienet) - total);
        
        if (client.getSaldo(idClienet) < total){
            System.out.println("\n\nSisa Saldo "+client.getSaldo(idClienet));
            System.out.println("\n\n=== SALDO TIDAK CUKUP ===\n\n");
            System.exit(0);
        }
        System.out.println("Sisa Saldo "+client.getNama(idClienet)+"\t: "+client.getSaldo(idClienet));
    }
    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idLaundry.add(idLaundry);
        this.banyak.add(banyaknya);
        jenisLaundry.editDurasi(idLaundry, jenisLaundry.getDurasi(idLaundry));
    }
    public int getIdLaundry(int idPetugas) {
        return this.idLaundry.get(idPetugas);
    }
    public int getBanyaknya(int idPetugas) {
        return this.banyak.get(idPetugas);
    }
    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}
