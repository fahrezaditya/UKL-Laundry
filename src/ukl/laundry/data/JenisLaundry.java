/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry.data;

import java.util.ArrayList;

/**
 *
 * @author FahrezaDityaAlfandry
 */
public class JenisLaundry {
    private ArrayList<String> jenis = new ArrayList<String>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public void setJenis(String jenis ){
        this.jenis.add(jenis);
    }
    public String getJenis(int idLaundry){
        return this.jenis.get(idLaundry);
    }
    public int getJmlJenis(){
        return this.jenis.size();
    }
    public void setDurasi(int durasi ){
        this.durasi.add(durasi);
    }
    public int getDurasi(int idLaundry){
        return this.durasi.get(idLaundry);
    }
    public void editDurasi(int idLaundry, int durasi){
        this.durasi.set(idLaundry, durasi);
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idLaundry){
        return this.harga.get(idLaundry);
    }
    
    public JenisLaundry() { // data jenis laundry
        setJenis("Cuci Basah");
        setDurasi(1);
        setHarga(3500);

        setJenis("Cuci Kering");
        setDurasi(3);
        setHarga(6000);
        
        setJenis("Cuci Setrika");
        setDurasi(4);
        setHarga(1000);
    }
}