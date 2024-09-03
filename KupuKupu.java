/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
class KupuKupu extends Serangga implements Terbang{
    public KupuKupu(){
        super("Kupu-Kupu", 6);
    }
    @Override
    public void bergerak(){
        System.out.println(nama +" bergerak dengan sayap.");
    }
    @Override
    public void terbang(){
        System.out.println(nama + " sedang terbang.");
    }
}
