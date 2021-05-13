/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analitika;

/**
 *
 * @author Ucenik
 */
public class Analitika {

    double x;
    double y;
    
    public Analitika (double x ,double y ){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Analitika tacka = new Analitika(7.65 , 3.42);
        System.out.println(tacka.x);
        System.out.println(tacka.y);
    }
    
}
