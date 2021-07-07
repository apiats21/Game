package main.java.com.apiats21;


public class Field {
    public enum Figure {Rock, Scissors, Paper}

    private Figure f1;
    private Figure f2;

    public Figure getF1() {
        return f1;
    }

    public void setF1(Figure f1) {
        this.f1 = f1;
    }

    public Figure getF2() {
        return f2;
    }

    public void setF2(Figure f2) {
        this.f2 = f2;
    }
}

