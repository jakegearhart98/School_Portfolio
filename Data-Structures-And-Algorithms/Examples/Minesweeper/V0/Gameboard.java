import java.util.Scanner;

public class Gameboard {
    private static final int DEFAULTSIZE = 8;
    private static final int DEFAULTNUMBEROFMINES = 10;

    private Cell[][] board;
    private int numberOfMines;
    private int guessedMines;
    private Scanner input;
    
    /**
    * constructor
    * Sets the board to size 8x8 and number of mines to 10.
    */
    public Gameboard() {
        board = new Cell[DEFAULTSIZE+2][DEFAULTSIZE+2];
        input = new Scanner(System.in);
        this.numberOfMines = DEFAULTNUMBEROFMINES;
        guessedMines = 0;
    }
    
    /**
    * the user interface to the game
    */
    public void run() {
        System.out.println("Hi! Welcome to MineSweeper!");
        System.out.print("Would you like to play a game? (y/n): ");
        char response = input.nextLine().toLowerCase().charAt(0);
        while (response == 'y') {
            initializeBoard();
            placeMines();
            if (playGame())
                System.out.println("You win!");
            else
                System.out.println("Boom! You lose.");
            System.out.println("Thank you for playing MineSweeper."); 
            System.out.print("Would you like to play another game? (y/n): ");
            response = input.nextLine().toLowerCase().charAt(0);
        }
    }

    /*
    * set all cells of the game board to the default cell values
    */
    private void initializeBoard() {

    }
    
    /*
    * randomly place mines in the cells of the game board
    */
    private void placeMines() {

    }
    
    
    /*
    * runs a single game
    */
    private boolean playGame() {
        return true;
    }    
    
}