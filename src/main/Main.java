package main;

public class Main {

    public static void main(String[] args) {

        Student kristi = null;
        try {
            kristi = new Student("kristi", "balla", 1234567, "Info & Cyber");
        } catch (UngültigesMatrikelnummerException e) {
            e.printStackTrace();
            System.out.println("dieser Studierende hat ein ungültiges Matrikelnummer");
        }

        //strg+D für duplicate
        Dozent felix = new Dozent("felix", "boes", new Modul(13, "AlPro"));

        //jeder ist ein person
        Person[] mitarbeiter = {kristi, felix};

        for (int i = 0; i < 2; i++) {

            System.out.println("Durchlauf: " + (i + 1));
            System.out.println("name = " + mitarbeiter[i].name
                    + "\nnachname = " + mitarbeiter[i].nachname + "\n\n");
        }
    }
}
