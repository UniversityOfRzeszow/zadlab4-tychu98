/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.FiguryGeometryczne;

import java.util.Scanner;

/**
 *
 * @author tychu
 */
public class Stozek {

    private final String name = "Stożek";
    private double r;
    private double l;
    private double H;
    private static final double pi = Math.PI;
    private double obj;
    private double pole;

    public double wpisz_r() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj promień podstawy stożka: ");
        r = we.nextDouble();
        return r;
    }
    
     public double wpisz_l() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość tworzacej stożka: ");
        l = we.nextDouble();
        return l;
    }
     
     public double wpisz_H() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość wyskokości stożka: ");
        H = we.nextDouble();
        return H;
    }

    public double pole() {
        pole = pi*r*(r+l);
        return pole;
    }

    public double objentosc() {
        obj = 1.0/3.0*pi*r*r*H;
        return obj;
    }

    public void wypisz() {
        System.out.println("Specyfikacja wybranej figury: ");
        System.out.println("Nazwa: " + name);
        System.out.println("Promień: " + r);
        System.out.println("Tworząca: "+ l);
        System.out.println("Wysokość: "+H);
        System.out.println("Objętość: " + obj);
        System.out.println("Pole: " + pole);
    }

}
