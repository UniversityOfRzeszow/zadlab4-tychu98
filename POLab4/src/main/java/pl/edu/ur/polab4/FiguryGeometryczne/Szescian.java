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
public class Szescian {

    private final String name = "Sześcian";
    private double x;

    private double objetosc;
    private double pole;

    public double wpisz_x() {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj długość krawędzi sześcianu: ");
        x = we.nextDouble();
        return x;
    }

    public double pole() {
        pole = 6 * x * x;
        return pole;
    }

    public double objetosc() {
        objetosc = x * x * x;
        return objetosc;
    }

    public void wypisz() {
        System.out.println("Specyfikacja wybranej figury: ");
        System.out.println("Nazwa: " + name);
        System.out.println("Długość krawędzi: " + x);
        System.out.println("Objetość: " + objetosc);
        System.out.println("Pole: " + pole);
    }

}
