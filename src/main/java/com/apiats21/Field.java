package main.java.com.apiats21;


public class Field {


    public enum Figure {Rock, Scissors, Paper}



    public enum Options {Rock, Scissor, Paper}

    public void welcomeMess() {
        System.out.println("Welcome to the game!!!");
        System.out.println("Please select: \n 1. Rock\n 2. Paper\n 3. Scissors");
    }
}

