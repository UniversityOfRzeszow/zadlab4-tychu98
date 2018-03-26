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
public class Kolo {
    
    private final String name = "Koło";
    private double r;
    private static final double pi=Math.PI;
    private double obwod;
    private double pole;
    
    
    public double wpisz(){
        Scanner we = new Scanner (System.in);
        System.out.println("Podaj promień koła: ");
        r=we.nextDouble();
        return r;
    }
    
    
    
    public double pole(){       
        pole=pi*r*r;
        return pole;    
    }
    
    public double obwod(){
        obwod=2*pi*r;
        return obwod;
    }
    
    
    public void wypisz(){
        System.out.println("Specyfikacja wybranej figury: ");
        System.out.println("Nazwa: "+name);
        System.out.println("Promień: "+r);
        System.out.println("Obwód: "+obwod);
        System.out.println("Pole: "+pole);
    }
    
    
}
