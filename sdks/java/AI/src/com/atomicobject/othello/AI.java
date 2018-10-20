package com.atomicobject.othello;

import java.util.Arrays;
import java.util.ListIterator;

public class AI {

    ListIterator<int[]> moveList;
    private int[] pointList;

    public AI(int[][] moves) {
        moveList = Arrays.asList(moves).listIterator();
    }

    public int[] computeMove(GameState state) {
        System.out.println("AI returning canned move for game state - " + state);
        //return moving[0];
        //return moveList.next();

        return new int[]{4, 2};
    }

    public void findMove() {
		
    }

}
