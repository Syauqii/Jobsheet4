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
public class interfacesegitiga implements interfacebangundatar{
    private double alas;
    private double tinggi;
    
    public interfacesegitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    public double hitungKel(){
        return 2 * alas+tinggi;
    }
    @Override
    public double hitungLuas(){
        return ((alas*tinggi)/2);
    }
}
