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
public class Pere extends Manusia{
     public Pere(){
     this.Tinggibadan = Tinggibadan;   
    }
     @Override
    public double htgBBI(){
        return ((Tinggibadan-100)-((Tinggibadan-100)*15/100));
    }
}
