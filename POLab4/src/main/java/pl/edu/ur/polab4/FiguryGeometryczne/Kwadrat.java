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
public class Kwadrat {
    
    private final String name = "Kwadrat";
    private double x;
    private double obwod;
    private double pole;

    public double wpisz() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość boku kwadratu: ");
        x = we.nextDouble();
        return x;
    }

    public double pole() {
        pole = x*x;
        return pole;
    }

    public double obwod() {
        obwod = 4*x;
        return obwod;
    }

    public void wypisz() {
        System.out.println("Specyfikacja wybranej figury: ");
        System.out.println("Nazwa: " + name);
        System.out.println("Długość boku: " + x);
        System.out.println("Obwód: " + obwod);
        System.out.println("Pole: " + pole);
    }
    
}
