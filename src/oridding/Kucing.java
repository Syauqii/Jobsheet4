/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oridding;

/**
 *
 * @author SYSTEM
 */
public class Kucing extends Hewan{
     void setNama(){
        String nama = "Carberus";
        System.out.println("Nama Hewan:"+nama);
    }
    void setSuara(){
        String suara = "Miaw Meow Meong";
        System.out.println("Suara Hewan:"+suara);
    }
    void setBerat(){
        double berat = 2.0;
        System.out.println("Berat Hewan:"+berat+"kg");
    }
}
