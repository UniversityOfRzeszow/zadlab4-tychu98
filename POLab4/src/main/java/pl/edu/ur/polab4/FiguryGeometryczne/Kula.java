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
public class Kula {

    private final String name = "Kula";
    private double r;
    private static final double pi = Math.PI;
    private double obj;
    private double pole;

    public double wpisz() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj promień kuli: ");
        r = we.nextDouble();
        return r;
    }

    public double pole() {
        pole = 4 * pi * r * r;
        return pole;
    }

    public double objentosc() {
        obj = 4 / 3 * pi * r * r * r;
        return obj;
    }

    public void wypisz() {
        System.out.println("Specyfikacja wybranej figury: ");
        System.out.println("Nazwa: " + name);
        System.out.println("Promień: " + r);
        System.out.println("Objętość: " + obj);
        System.out.println("Pole: " + pole);
    }

}
