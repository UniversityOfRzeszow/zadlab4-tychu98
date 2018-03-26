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
public class Prostokat {
    private final String name = "Prostokąt";
    private double x;
    private double y;
    private double obwod;
    private double pole;

    public double wpisz_x() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku prostokąta: ");
        x = we.nextDouble();
        return x;
    }
    
    public double wpisz_y() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość drugiego boku prostokąta: ");
        y = we.nextDouble();
        return y;
    }

    public double pole() {
        pole = x*y;
        return pole;
    }

    public double obwod() {
        obwod = 2*x+2*y;
        return obwod;
    }

    public void wypisz() {
        System.out.println("Specyfikacja wybranej figury: ");
        System.out.println("Nazwa: " + name);
        System.out.println("Długość pierwszego boku: " + x);
        System.out.println("Długość drugiego boku: " + y);
        System.out.println("Obwód: " + obwod);
        System.out.println("Pole: " + pole);
    }
    
}
