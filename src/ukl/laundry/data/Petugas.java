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
public class Petugas implements User{
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> jabatan = new ArrayList<String>();
    
    public void setJabatan(String jabatan) {
        this.jabatan.add(jabatan);
    }
    public String getJabatan (int idPetugas) {
        return this.jabatan.get(idPetugas);
    }
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }
    @Override
    public void setNama(String namaPetugas ){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }
    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }
    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    }
    public Petugas(){ // data petugas
        setNama("Admin");
        setAlamat("Sawojajar");
        setTelepon("081234567899");
        setJabatan("Owner");
    }
}
