/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstrak;

/**
 *
 * @author SYSTEM
 */
public class Abstractemplate {
    public static void main(String[] args){
        bangundatar ob1 = new bujursangkar(10);
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+ob1.hitungLuas());
        System.out.println("Kelilingnya   = "+ob1.hitungKel());
        System.out.println("\n");
        
        bangundatar ob2 = new Lingkaran(7);
        System.out.println("Luas Lingkaran dengan Jari jari 7 = "+ob2.hitungLuas());
        System.out.println("Kelilingnya   = "+ob2.hitungKel());
        System.out.println("\n");
    }
}
