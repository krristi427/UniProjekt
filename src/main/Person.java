package main;

public class Person {

    String name;
    String nachname;

    public Person(String name, String nachname) {
        this.name = name;
        this.nachname = nachname;
    }

    //add the space in live demo ;)
    public void sayHi() {
        System.out.println("Hi, ich bin " + name + " " + nachname);
    }
}
