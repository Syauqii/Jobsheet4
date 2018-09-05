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
public class Lingkaran extends bangundatar{
    private double r;
    
    public Lingkaran(double r){
        this.r = r;
    } 
    @Override
    public double hitungKel(){
        return 2 * 3.14*r;
    }
    @Override
    public double hitungLuas(){
        return 3.14*r*r;
    }
}
