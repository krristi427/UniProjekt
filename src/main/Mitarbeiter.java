package main;

public class Mitarbeiter {

    String name;
    String nachname;
    int nummer;
    boolean canHack;

    //mit Alt+einfg für shortcuts
    public Mitarbeiter(String name, String nachname, int nummer, boolean canHack) {
        this.name = name;
        this.nachname = nachname;
        this.nummer = nummer;
        this.canHack = canHack;
    }
}
