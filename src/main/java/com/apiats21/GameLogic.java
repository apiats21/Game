package main.java.com.apiats21;
/*Field: приватные поля и методы для доступа к ним?

GameLogic: создать обьект  класса field?
две ячейки
минимум 7 методов
1. get user input
2. валидировать код?
3. get pc input
4. валидировать код?
5.
6.
7.  счет игры, продолжить игу...
Как в метод compareMoves передать returns методов userMove() и compMove()

Game runner:
только обьект класса GameLogic
метод startGame() и все
 */

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    int userMove;
    int randNum;
    Win winner;

    Field fl = new Field();

    public void intro() {
        fl.welcomeMess();
    }
    public void userOpt() {
        Scanner sc = new Scanner(System.in);
        this.userMove = sc.nextInt();
        Field.Figure userMove = Field.Figure.values()[sc.nextInt()-1];


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
        System.out.println("Your move: " + Field.Options.values()[userMove-1] + "\nComputer move: " +
                            Field.Options.values()[randNum-1]);
        System.out.println("Winner is " + winner);
    }
    public void start() {
        intro();
        userOpt();
        compMove();
        compare();
        prntResults();
    }
}
