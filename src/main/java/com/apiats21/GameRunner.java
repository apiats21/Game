package main.java.com.apiats21;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic gl = new GameLogic();
        gl.intro();
        gl.userOpt();
        gl.compMove();
        gl.compare();
        gl.prntResults();

    }
}
