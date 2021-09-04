package main;

//create class Modul live
public class Modul {

    int nummer;
    String name;

    public Modul(int nummer, String name) {
        this.nummer = nummer;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Modul {\n" +
                "nummer=" + nummer +
                ", name='" + name + "'\n" +
                '}';
    }
}
