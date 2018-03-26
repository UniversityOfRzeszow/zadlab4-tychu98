/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadz.Dane;

import java.util.*;

/**
 *
 * @author tychu
 */
public class Tablica {

    
    Student student[] = new Student[101];
Scanner we = new Scanner(System.in);

    public void zad1_2(int i) {
student[i] = new Student("", "", "", i, 0);
        System.out.println("Imie:");
        student[i].imie = we.next();
        System.out.println("Nazwisko: ");
        student[i].nazwisko = we.next();
        System.out.println("Nazwa_Specjalności: ");
        student[i].nazwa_specjalnosci = we.next();
        System.out.println("Rok studiów:");
        student[i].rok_studiow = we.nextInt();
        //student[i] = new Student(student[i].imie,  student[i].nazwisko, student[i].nazwa_specjalnosci, i, student[i].rok_studiow);
       

    }
    
    
    

    public String imie(int i) {

        System.out.println("Imie:");
        student[i].imie = we.next();
        return student[i].imie;
    }

    public String nazwisko(int i) {

        System.out.println("Nazwisko:");
        student[i].nazwisko = we.next();
        return student[i].nazwisko;
    }

    public String nazwa_specjalności(int i) {

        System.out.println("Nazwa_Specjalności:");
        student[i].nazwa_specjalnosci = we.next();
        return student[i].nazwa_specjalnosci;
    }

    public int rok_studiow(int i) {

        System.out.println("Rok_studiow:");
        student[i].rok_studiow = we.nextInt();
        return student[i].rok_studiow;
    }
    
    
    

    public void przypisz() {
        for (int i = 1; i <= 100; i++) {
            student[i] = new Student("", "", "", i, 0);
            student[i].imie = "";
            student[i].nazwisko = "";
            student[i].nazwa_specjalnosci = "";
            student[i].nr_indeksu = i;
            student[i].rok_studiow = 0;
        }

    }

    public void nadpisz(int i) {
        student[i].imie = "";
        student[i].nazwisko = "";
        student[i].nazwa_specjalnosci = "";
        student[i].nr_indeksu = i;
        student[i].rok_studiow = 0;

    }

    public void wyswietl(int i) {
        System.out.println("imie: " + student[i].imie);
        System.out.println("nazwisko: " + student[i].nazwisko);
        System.out.println("nazwa_specjalnosci: " + student[i].nazwa_specjalnosci);
        System.out.println("nr_indeksu: " + student[i].nr_indeksu);
        System.out.println("rok_studiow: " + student[i].rok_studiow);

    }
    
     public void wyswietlAll() {
         for(int i=1;i<101;i++){
             
         
        System.out.println("\nImie: " + student[i].imie);
        System.out.println("Nazwisko: " + student[i].nazwisko);
        System.out.println("Nazwa_specjalnosci: " + student[i].nazwa_specjalnosci);
        System.out.println("Nr_indeksu: " + student[i].nr_indeksu);
        System.out.println("Rok_studiow: " + student[i].rok_studiow);
         }
         
             

    }
     public void zakres(int i, int j){
         for(;i<=j;i++){
        System.out.println("\nImie: " + student[i].imie);
        System.out.println("Nazwisko: " + student[i].nazwisko);
        System.out.println("Nazwa_specjalnosci: " + student[i].nazwa_specjalnosci);
        System.out.println("Nr_indeksu: " + student[i].nr_indeksu);
        System.out.println("Rok_studiow: " + student[i].rok_studiow);
             
             
             
         }
     }

}
