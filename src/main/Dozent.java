package main;

public class Dozent extends Person {

    Modul modul;

    public Dozent(String name, String nachname, Modul modul) {
        super(name, nachname);
        this.modul = modul;
    }
}
