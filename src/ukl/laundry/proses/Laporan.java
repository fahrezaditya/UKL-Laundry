/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry.proses;

import ukl.laundry.data.JenisLaundry;
import ukl.laundry.proses.Transaksi;
import ukl.laundry.data.Client;
import ukl.laundry.data.Petugas;

/**
 *
 * @author FahrezaDityaAlfandry
 */
public class Laporan {
    
    public void laporan(Petugas petugas){ // menampilkan data petugas
        System.out.println("Nama Petugas\t: "+petugas.getNama(0));
        System.out.println("Telp\t\t: "+petugas.getTelepon(0));
        System.out.println("Status\t\t: "+petugas.getJabatan(0));
    }
    public void laporan(JenisLaundry jenisLaundry){ // menampilkan daftar jenis laundry
        int x = jenisLaundry.getJmlJenis();
        System.out.println("\n\n== Tabel Jenis Laundry ==\n");
        System.out.println("ID   Jenis Laundry\tDurasi(hr)\tHarga(/kg)");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"    "+jenisLaundry.getJenis(i)+"  \t"+jenisLaundry.getDurasi(i)+"hr\t\t"+jenisLaundry.getHarga(i)+"/kg");
        }
    }
    public void laporan(Client client){ // menampilkan data client
        int x = client.getJmlClient();
        System.out.println("\n=== Tabel Client ===\n");
        System.out.println("ID  Nama    Alamat\tTelepon\t\tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"   "+client.getNama(i)+"\t    "+client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+client.getSaldo(i));
        }
    }
    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry){ // laporan hasil transaksi
        int x = transaksi.getJmlTransaksi();
        System.out.println("\n== Laporan Transaksi== \n");
        System.out.println("Jenis Laundry\tJumlah(kg) \tHarga/kg \tJumlah");
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah=transaksi.getBanyaknya(i)*jenisLaundry.getHarga(transaksi.getIdLaundry(i));
            total+=jumlah;
            System.out.println(jenisLaundry.getJenis(transaksi.getIdLaundry(i))+"\t"+transaksi.getBanyaknya(i)+"kg\t\t"+jenisLaundry.getHarga(transaksi.getIdLaundry(i))+"/kg\t\t"+jumlah);
        }
        System.out.println("\nTotal Omset = "+total);
    }
}
