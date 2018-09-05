/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author SYSTEM
 */
public class run {
    public static void main(String[] args){ 
        Manusia l = new Laki();
        Manusia p = new Pere();
        
        
        System.out.println("User 1");        
        System.out.print("tinggi badan = ");
        Scanner m = new Scanner(System.in);        

        
        System.out.print("Silahkan pilih Jenis Kelamin (L/P) = ");
        String pil = m.next();
        switch(pil){
            case "l" : 
                       System.out.println("Berat badan idal kamu ="+l.htgBBI());
            break;
            case "p" : 
                       System.out.println("Berat badan idal kamu ="+p.htgBBI());
            break;
            case "L" : 
                       System.out.println("Berat badan idal kamu ="+l.htgBBI());
            break;
            case "P" : 
                       System.out.println("Berat badan idal kamu ="+p.htgBBI());
            break;
     }
        System.out.println("\n");
        System.out.println("User 2");
        System.out.print("tinggi badan = ");
               
        System.out.print("Silahkan pilih Jenis Kelamin (L/P) = ");
        pil = m.next();
        switch(pil){
            case "l" : 
                       System.out.println("Berat badan idal kamu ="+l.htgBBI());
            break;
            case "p" : 
                       System.out.println("Berat badan idal kamu ="+p.htgBBI());
            break;
            case "L" : 
                       System.out.println("Berat badan idal kamu ="+l.htgBBI());
            break;
            case "P" : 
                       System.out.println("Berat badan idal kamu ="+p.htgBBI());
            break;
            
        } 
        
    }
}
