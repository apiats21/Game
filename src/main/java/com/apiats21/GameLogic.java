package main.java.com.apiats21;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    int userMove;
    int randNum;
    Win winner;

    public void intro() {
        Field.welcomeMess();
    }
    public void userOpt() {
        Scanner sc = new Scanner(System.in);
        this.userMove = sc.nextInt();
    }
    public void compMove() {
        this.randNum = new Random().nextInt(3) + 1;
    }

    public void compare () {
        if (userMove == randNum) winner = Win.Nobody;
        else if(userMove== 1 && randNum == 2 || userMove == 2 && randNum == 3 || userMove == 3 && randNum == 2)
             winner = Win.User;
        else winner = Win.Computer;
    }
    public void prntResults() {
        System.out.println("Your move: " + Field.values()[userMove-1] + "\nComputer move: " + Field.values()[randNum-1]);
        System.out.println("Winner is " + winner);
    }
}
