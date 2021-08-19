package main;

public class Main {

    public static void main(String[] args) {

        String studiName = "kristi";
        String studiNachname = "balla";
        int studiMitarbeiterNummer = 1111111;
        boolean kristiCanHackYou = false;

        String dozentName = "felix";
        String dozentNachname = "boes";
        int dozentMitarbeiterNummer = 42;
        boolean felixCanHackYou = true;

        String[][] namen = {{studiName, studiNachname}, {dozentName, dozentNachname}};

        for (int i = 0; i < 2; i++) {

            System.out.println("Durchlauf: " + (i + 1));
            System.out.println("name = " + namen[i][0]
                    + "\nnachname = " + namen[i][1] + "\n\n");
        }
    }
}
