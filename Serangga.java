/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
abstract class Serangga {
    protected String nama;
    protected int jumlahKaki;
    
public Serangga(String nama, int jumlahKaki){
    this.nama = nama;
    this.jumlahKaki = jumlahKaki;
}
public abstract void bergerak();
public void deskripsi(){
    System.out.println("Nama: "+nama);
   System.out.println("Jumlah Kaki: "+ jumlahKaki);
}
}

interface Terbang{
    void terbang();
}