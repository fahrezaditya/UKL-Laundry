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
public class Client implements User{
    
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public void setSaldo(int saldo) { //set saldo client
        this.saldo.add(saldo);
    }
    public int getSaldo (int idClient) { //mengambil saldo client
        return this.saldo.get(idClient);
    }
    public void editSaldo (int idClient, int saldo) { // mengubah nilai saldo
        this.saldo.set(idClient, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    @Override
    public void setNama(String namaClient ){ 
        this.namaClient.add(namaClient);
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
    public String getNama(int idClient){
        return this.namaClient.get(idClient);
    }
    @Override
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }
    @Override
    public String getTelepon(int idClient){
        return this.telepon.get(idClient);
    }
    public Client(){ // data client
        setNama("Me");
        setAlamat("Kediri");
        setTelepon("085123456789");
        setSaldo(500000);
        
        setNama("And");
        setAlamat("Surabaya");
        setTelepon("085123987465");
        setSaldo(250000);
        
        setNama("Yu");
        setAlamat("Malang");
        setTelepon("085987654321");
        setSaldo(350000);
    }
}
