package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.FiguryGeometryczne.Kolo;
import pl.edu.ur.polab4.FiguryGeometryczne.Kula;
import pl.edu.ur.polab4.FiguryGeometryczne.Kwadrat;
import pl.edu.ur.polab4.FiguryGeometryczne.Prostokat;
import pl.edu.ur.polab4.FiguryGeometryczne.Prostopadloscian;
import pl.edu.ur.polab4.FiguryGeometryczne.Stozek;
import pl.edu.ur.polab4.FiguryGeometryczne.Szescian;

public class Main {

    public static void main(String[] args) {

        Scanner we = new Scanner(System.in);
        System.out.println("Podaj numer figury ktorej specyfikację chcesz poznać \n------------\n 1-Koło \n------------\n 2-Kula \n------------\n 3-Kwadrat \n------------\n 4-Prostokąt \n------------\n 5-Prostopadłościan \n------------\n 6-Stożek \n------------\n 7-Szścian \n------------\n");
        int n = we.nextInt();

        switch (n) {

            case 1:
                Kolo kolo = new Kolo();
                kolo.wpisz();
                kolo.pole();
                kolo.obwod();
                kolo.wypisz();
                break;

            case 2:
                Kula kula = new Kula();
                kula.wpisz();
                kula.pole();
                kula.objentosc();
                kula.wypisz();
                break;

            case 3:
                Kwadrat kwadrat = new Kwadrat();
                kwadrat.wpisz();
                kwadrat.pole();
                kwadrat.obwod();
                kwadrat.wypisz();
                break;

            case 4:
                Prostokat prostokat = new Prostokat();
                prostokat.wpisz_x();
                prostokat.wpisz_y();
                prostokat.pole();
                prostokat.obwod();
                prostokat.wypisz();
                break;

            case 5:
                Prostopadloscian prostopadloscian = new Prostopadloscian();
                prostopadloscian.wpisz_x();
                prostopadloscian.wpisz_y();
                prostopadloscian.wpisz_z();
                prostopadloscian.pole();
                prostopadloscian.objetosc();
                prostopadloscian.wypisz();
                break;
                
            case 6: 
                Stozek stozek = new Stozek();
                stozek.wpisz_r();
                stozek.wpisz_l();
                stozek.wpisz_H();
                stozek.pole();
                stozek.objentosc();
                stozek.wypisz();
                break;
            case 7:
                Szescian szescian = new Szescian();
                szescian.wpisz_x();
                szescian.pole();
                szescian.objetosc();
                szescian.wypisz();;
                break;
            default:
                System.out.println("Wykroczono poza wskazany zakres(nie ma figury oznaczonej wybranym numerem)");
                
        }
        
        
        
    }

}
