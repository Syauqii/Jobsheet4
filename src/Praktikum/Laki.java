/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author SYSTEM
 */
public class Laki extends Manusia{
    public Laki(){
     this.Tinggibadan = Tinggibadan;   
    }
    @Override
    public double htgBBI(){
        return ((Tinggibadan-100)-((Tinggibadan-100)*10/100));
    }
}
