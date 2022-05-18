import java.util.Scanner;
import java.util.Random;

public class Gameboard {
    private static final int DEFAULTSIZE = 8;
    private static final int DEFAULTNUMBEROFMINES = 10;

    private Cell[][] board;
    private int numberOfMines;
    private int guessedMines;
    private Scanner input;
    
    /**
    * constructor
    * @param size the number of rows and columns in the game board
    * @param numberOfMines the number of mines to place on the game board
    */
    public Gameboard(int size, int numberOfMines) {
        board = new Cell[size+2][size+2];
        input = new Scanner(System.in);
        this.numberOfMines = numberOfMines;
        guessedMines = 0;
    }
    
    public Gameboard() {
        this(DEFAULTSIZE, DEFAULTNUMBEROFMINES);
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
        for (int i=0; i<board.length; i++) 
            for (int j=0; j<board.length; j++) 
                board[i][j] = new Cell();
    }
    
    /*
    * randomly place mines in the cells of the game board
    */
    private void placeMines() {
        Random placer = new Random();
        int minesPlaced = 0;
        int row, column;
        
        while (minesPlaced < numberOfMines) {
            row = placer.nextInt(board.length-2) + 1;
            column = placer.nextInt(board.length-2) + 1;
            if (!board[row][column].containsMine()) {
                board[row][column].addMine();
                minesPlaced++;
            }
        }
    }
    
    /*
    * runs a single game
    */
    private boolean playGame() {
        return true;
    }    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i=1; i<DEFAULTSIZE+1; i++) {
            for (int j=1; j<DEFAULTSIZE+1; j++)
                sb.append(board[i][j].getDisplayValue() + " ");
            sb.append("\n");
        }
        return sb.toString();
    }
  
}