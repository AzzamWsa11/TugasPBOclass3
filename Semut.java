/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
class Semut extends Serangga{
    public Semut(){
        super("Semut",8);
    }
    @Override
    public void bergerak(){
        System.out.println(nama + " bergerak dengan kaki.");
    }
}
