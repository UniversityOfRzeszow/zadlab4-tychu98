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
public class Prostopadloscian {
    private final String name = "Prostopadłościan";
    private double x;
    private double y;
    private double z;
    private double objetosc;
    private double pole;

    public double wpisz_x() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość pierwszej krawędzi podstawy prostopadłościanu: ");
        x = we.nextDouble();
        return x;
    }
    
    public double wpisz_y() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość drugiej krawędzi podstawy prostopadłościanu: ");
        y = we.nextDouble();
        return y;
    }
    
    public double wpisz_z() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość wysokości prostopadłościanu: ");
        z = we.nextDouble();
        return z;
    }

    public double pole() {
        pole = 2*x*y+2*x*z+2*y*z;
        return pole;
    }

    public double objetosc() {
        objetosc = x*y*z ;
        return objetosc;
    }

    public void wypisz() {
        System.out.println("Specyfikacja wybranej figury: ");
        System.out.println("Nazwa: " + name);
        System.out.println("Długość pierwszej krawędzi podstawy: " + x);
        System.out.println("Długość drugiej krawędzi podstawy: " + y);
        System.out.println("Wysokość: "+z);
        System.out.println("Objetość: " + objetosc);
        System.out.println("Pole: " + pole);
    }
    
}
