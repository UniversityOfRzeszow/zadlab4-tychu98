/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadz.Dane;

import java.util.Scanner;

/**
 *
 * @author tychu
 */
public class wypiszDane {

    public static void main(String[] args) {

        Tablica student = new Tablica();
        student.przypisz();
        Scanner we = new Scanner(System.in);
        int x;
        int przelacznik=1;
        

        while (przelacznik!=0)
        
        {
            
            System.out.println("Podaj numer podpunktu który ma zostac wykonany(1-6): ");
            int n = we.nextInt();
       
            
            switch (n) {
            case 1:

                System.out.println("Wprowadź numer indeksu studenta którego dane chcesz wprowadzić: ");
                x = we.nextInt();
                /*student.imie(x);
                student.nazwisko(x);
                student.nazwa_specjalności(x);
                student.rok_studiow(x);
                */
                student.zad1_2(x);
                
                
                        
                break;
            case 2:
                System.out.println("podaj index studenta którego dane maja zostać nadpisane: ");
                x=we.nextInt();
                student.imie(x);
                student.nazwisko(x);
                student.nazwa_specjalności(x);
                student.rok_studiow(x);
                break;
                
            case 3:
                System.out.println("podaj index studenta którego dane maja zostać usunięte: ");
                x=we.nextInt();
                student.nadpisz(x);                
                break;
                
            case 4:
                System.out.println("podaj index studenta którego dane maja zostać wyświetlone: ");
                x=we.nextInt();
                student.wyswietl(x);
                break;
                
            case 5:
                System.out.println("wszystkie obiekty: ");
                student.wyswietlAll();
                break;
                
            case 6:
                System.out.println("podaj zakres index-ów studentów których dane maja zostać wyświetlone: ");
                System.out.println("X: ");
                x=we.nextInt();
                System.out.println("Y: ");
                int y=we.nextInt();
                student.zakres(x, y);
                
            default:
                System.out.println("Wykroczono poza wyznaczony rozmiar");
                break;
                
        }
            System.out.println("\n\nJeśli nadal chcesz kontynuować wpisz 1 jeśli nie wpisz 0:\n\n");
                przelacznik = we.nextInt();
        
            
        
        }

    }

}
