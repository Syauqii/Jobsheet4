/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oloading;

/**
 *
 * @author SYSTEM
 */
public class TesTugas1 {
    public static void main(String[] args){
        RerataNilai n = new RerataNilai();
        System.out.println("Rerata nilai 123, 567, dan 744 adalah :"+n.average(123,567,744));
        System.out.println("Rerata nilai 21 dan 13 adalah :"+n.average(21.2,13));
        System.out.println("Rerata nilai 19.3 dan 39.5 adalah :"+n.average(19.3,39.5));
        
    }
}
