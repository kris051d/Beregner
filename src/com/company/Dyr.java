package com.company;

public class Dyr {

    int antalBen = 8;
    double kropTemperatur = 3.4;
    boolean levende = false;
    String navn = "Hector";

    //TODO lav flest muligt constructors

    Dyr() {}

    //1
    public Dyr(int antalBen) {
        this.antalBen = antalBen;
    }

    public Dyr(double kropTemperatur) {
        this.kropTemperatur = kropTemperatur;
    }

    public Dyr(boolean levende) {
        this.levende = levende;
    }

    public Dyr(String navn) {
        this.navn = navn;
    }

    //2
    public Dyr(int antalBen, double kropTemperatur) {
        this.antalBen = antalBen;
        this.kropTemperatur = kropTemperatur;
    }

    public Dyr(int antalBen, boolean levende) {
        this.antalBen = antalBen;
        this.levende = levende;
    }

    public Dyr(int antalBen, String navn) {
        this.antalBen = antalBen;
        this.navn = navn;
    }

    public Dyr(double kropTemperatur, boolean levende) {
        this.kropTemperatur = kropTemperatur;
        this.levende = levende;
    }

    public Dyr(double kropTemperatur, String navn) {
        this.kropTemperatur = kropTemperatur;
        this.navn = navn;
    }

    public Dyr(boolean levende, String navn) {
        this.levende = levende;
        this.navn = navn;
    }

    public static void main(String[] args) {

        //TODO opret et objekt for hver constructor

        //1
        Dyr x1 = new Dyr(5);
        Dyr x2 = new Dyr(5.9);
        Dyr x3 = new Dyr(true);
        Dyr x4 = new Dyr("Hector");

        //2
        Dyr x5 = new Dyr(5, 3.4);
        Dyr x6 = new Dyr(5, true);
        Dyr x7 = new Dyr(5, "Hector");
        Dyr x8 = new Dyr(3.4, true);
        Dyr x9 = new Dyr(3.4, "Hector");
        Dyr x10 = new Dyr(true, "Hector");
    }
}
