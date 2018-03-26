/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadz.Dane;

/**
 *
 * @author tychu
 */
public class Student {

    String imie;
     String nazwisko;
     String nazwa_specjalnosci;
     int nr_indeksu;
     int rok_studiow;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwa_specjalnosci() {
        return nazwa_specjalnosci;
    }

    public void setNazwa_specjalnosci(String nazwa_specjalnosci) {
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }
     
     
     

     
    public Student(String imie, String nazwisko, String nazwa_specjalnosci, int nr_indeksu, int rok_studiow) {
        if (imie == null) {
            this.imie = "";
        } else {
            this.imie = imie;
        }
        if (nazwisko == null) {
            this.nazwisko = "";
        } else {
            this.nazwisko = nazwisko;
        }
        if (nazwa_specjalnosci == null) {
            this.nazwa_specjalnosci = "";
        } else {
            this.nazwa_specjalnosci = nazwa_specjalnosci;
        }
        if (nr_indeksu < 0) {
            this.nr_indeksu = 0;
        } else {
            this.nr_indeksu = nr_indeksu;
        }
        if (rok_studiow < 0) {
            this.rok_studiow = 0;
        } else {
            this.rok_studiow = rok_studiow;
        }

  
  
       
    }
}


