/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author SYSTEM
 */
public class interfacesample {
    public static void main(String[] args){
        interfacebangundatar ob1 = new interfacebujursangkar(10);
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+ob1.hitungLuas());
        System.out.println("Kelilingnya   = "+ob1.hitungKel());
        System.out.println("\n");
        
        
        interfacebangundatar ob2 = new interfacesegitiga(6,8);
        System.out.println("Luas Segitiga dengan alas 6 dan tinggi 8 = "+ob2.hitungLuas());
        System.out.println("Kelilingnya   = "+ob2.hitungKel());
    }
}
