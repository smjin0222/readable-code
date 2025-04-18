package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.Advanced;
import cleancode.minesweeper.tobe.gamelevel.GameLevel;

public class GameApplication {
    public static void main(String[] args) {
        GameLevel gameLevel = new Advanced();

        MineSweeper mineSweeper = new MineSweeper(gameLevel);
        mineSweeper.run();
    }
}
