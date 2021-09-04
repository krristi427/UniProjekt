package main;

public class Main {

    public static void main(String[] args) {

        Mitarbeiter kristi = new Mitarbeiter("kristi", "balla", 1111111, false);

        //strg+D für duplicate
        Mitarbeiter felix = new Mitarbeiter("felix", "boes", 42, true);

        Mitarbeiter[] mitarbeiter = {kristi, felix};

        for (int i = 0; i < 2; i++) {

            System.out.println("Durchlauf: " + (i + 1));
            System.out.println("name = " + mitarbeiter[i].name
                    + "\nnachname = " + mitarbeiter[i].nachname + "\n\n");
        }
    }
}
