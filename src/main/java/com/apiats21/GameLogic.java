package main.java.com.apiats21;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    Win winner;
    Field.Figure userMoveF;
    Field.Figure randNumF;

    Field fl = new Field();

    public void intro() {
        fl.welcomeMess();
    }

    public void setUserMove() {
        Scanner sc = new Scanner(System.in);
        randNumF = Field.Figure.values()[sc.nextInt()-1];
        fl.setF1(randNumF);
    }

    public void setCompMove() {
        int rand = new Random().nextInt(3) + 1;
        userMoveF = Field.Figure.values()[rand-1];
        fl.setF2(userMoveF);
    }

    public void compare() {
        if (fl.getF1() == fl.getF2()) winner = Win.Nobody;
        else if(fl.getF2() == Field.Figure.Rock && fl.getF1() == Field.Figure.Scissors
                || fl.getF2() == Field.Figure.Scissors && fl.getF1() == Field.Figure.Paper
                || fl.getF2() == Field.Figure.Paper && fl.getF1() == Field.Figure.Rock)
            winner = Win.User;
        else winner = Win.Computer;
    }

    public void prntResultsF() {
        System.out.println("Your move: " + fl.getF2() + "\nComputer move: " +
                fl.getF1());
        System.out.println("Winner is " + winner);
    }


    public void start() {
        intro();
        setUserMove();
        setCompMove();
        compare();
        prntResultsF();
    }
}
