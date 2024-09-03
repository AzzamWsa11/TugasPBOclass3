/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
class TestBank {
public static void main(String args[]){
    Bank b;
    b=new SBI();
    System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
    b=new PNB();
    System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
}
}
