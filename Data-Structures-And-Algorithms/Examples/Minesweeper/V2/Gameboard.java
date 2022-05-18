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
        int row, column;
        char response;
        boolean continueGame = true;
        while (continueGame) {
            System.out.println(this);
            System.out.print("Would you like to peek? (y/n): ");
            response = input.nextLine().toLowerCase().charAt(0);
            if (response == 'y')
                peek();
            System.out.print("Please enter a row number: ");
            row = input.nextInt();
            System.out.print("Please enter a column number: ");
            column = input.nextInt();
            input.nextLine();
            System.out.print("Does row " + row + " and column " + column 
                                + " contain a mine? (y/n): ");
            response = input.nextLine().toLowerCase().charAt(0);
            continueGame = processResponse(row, column, response);
            if (guessedMines == numberOfMines)
                break;
        }
        return continueGame;
    }
    
    /*
    *   determine if response continues or loses
    */
    private boolean processResponse(int row, int column, char response) {
        if (response == 'y')
            if (board[row][column].containsMine()) {
                board[row][column].setDisplayValue('M');
                guessedMines++;
                return true;
            }
            else
                return false;
        else
            if (!board[row][column].containsMine()) {
                board[row][column].setDisplayValue((char) (countAdjacent(row, column) + '0'));
                return true;
            }
            else
                return false;
    }
    
    /*
    * find the number of adjacent cells that contain mines
    */
    private int countAdjacent(int row, int column) {
        int mineCount = 0;
        for (int i=row-1; i<=row+1; i++)
            for (int j=column-1; j<=column+1; j++)
                if (board[i][j].containsMine())
                    mineCount++;
        return mineCount;
    }
    
    /*
    * show all mines and correct guesses
    */
    private void peek() {
        for (int i=1; i<DEFAULTSIZE+1; i++) {
            for (int j=1; j<DEFAULTSIZE+1; j++)
                if (board[i][j].containsMine())
                    System.out.print("M ");
                else
                    System.out.print(board[i][j].getDisplayValue() + " ");
            System.out.println();
        }
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