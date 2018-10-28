/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan55.handphone;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menampilksan status handphone
 */ 
public class BlackBerry extends Handphone{

 private String pinBB;

    public BlackBerry(String pinBB, String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
          System.out.println("\nManufaktur : " +man );
        System.out.println("OS : " +os );
        System.out.println("Model : " +model );
        System.out.println("Harga : " +harga );
        System.out.println("Pin : " +pinBB);
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
 
 
    
}
