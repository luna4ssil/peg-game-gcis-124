package peggame;

public enum GameState {
    NOT_STARTED, // can only apply before the game starts
    IN_PROGRESS, 
    STALEMATE, // game done, ends in a loss: more than one peg
    WON; // game done, ends in a win: only one peg
}