package main;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    int matrikelnummer;
    String fach;

    //create liste aller module nachdem du Modul erstellt hast
    // und erkläre was dieser initial capacity macht
    List<Modul> belegteModule = new ArrayList<>(4);

    public Student(String name, String nachname, int matrikelnummer, String fach) throws UngültigesMatrikelnummerException {
        super(name, nachname);

        int anzahlZiffern = (int) (Math.log10(matrikelnummer) + 1);
        if (anzahlZiffern > 7 || anzahlZiffern < 1) { //vllt einen | machen und dann den fehler korrigieren
            throw new UngültigesMatrikelnummerException("Matrikelnummer hat zu viel oder zu wenig Ziffern");
        }

        this.matrikelnummer = matrikelnummer;
        this.fach = fach;
    }

    @Override
    public void sayHi() {
        System.out.println("Ein " + fach + "-Studi namens " + name + " sagt hallo");
    }

    //diese Methoden werden nachdem die Liste da ist erstellt
    public void belegeModul(Modul modul) {
        belegteModule.add(modul);
        System.out.println(modul + "\nwurde hinzugefügt");
    }

    public List<Modul> getBelegteModule() {

        //in Main die liste aller module durchgehen
        return belegteModule;
    }
}
