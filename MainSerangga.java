/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
//fungsi dari class ini adalah untuk menjalakan program
public class MainSerangga {
    public static void main(String[] args){
    //membuat objek KupuKupu
    KupuKupu kupuKupu = new KupuKupu();
    kupuKupu.deskripsi();
    kupuKupu.bergerak();
    kupuKupu.terbang();
    
    System.out.println();
    
    //membuat objek semut
    Semut semut = new Semut();
    semut.deskripsi();
    semut.bergerak();
    }
}
