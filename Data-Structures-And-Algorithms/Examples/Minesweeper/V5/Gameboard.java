import java.util.Random;

public class Gameboard {
      
  private static final int DEFAULTSIZE = 8;
  private static final int DEFAULTNUMBEROFMINES = 10;

  private Cell[][] board;
  private int numberOfMines;
  private int guessedMines;
  private int size;

  /**
  * constructor
  * @param size the number of rows and columns in the game board
  * @param numberOfMines the number of mines to place on the game board
  */
  public Gameboard(int size, int numberOfMines) {
    this.size = size;
    board = new Cell[size+2][size+2];
    this.numberOfMines = numberOfMines;
    guessedMines = 0;
  }
  
  /**
  * constructor
  * uses default board size and number of mines
  */
  public Gameboard() {
      this(DEFAULTSIZE, DEFAULTNUMBEROFMINES);
  }

  /**
  * @return the dimension of the square game board
  */
  public int size() {
    return size;
  }

  /**
  * @return the number of mines
  */
  public int getNumberOfMines() {
    return numberOfMines;
  }

  /**
  * @return the number of mines guessed
  */
  public int getGuessedMines() {
    return guessedMines;
  }

  /**
  * set all cells of the game board to the default cell values
  */
  public void initializeBoard() {
    for (int i=0; i<board.length; i++) 
      for (int j=0; j<board.length; j++) 
        board[i][j] = new Cell();
  }
    
  /**
  * randomly place mines in the cells of the game board
  */
  public void placeMines() {
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
    
  private int countAdjacentMines(int row, int column) {
    int mineCount = 0;
    for (int i=row-1; i<=row+1; i++)
      for (int j=column-1; j<=column+1; j++)
        if (board[i][j].containsMine())
          mineCount++;
    return mineCount;
  }

  /**
  * determine if response continues or loses
  * @return true if guess is correct, false otherwise
  */
  public boolean checkForMine(int row, int column, char response) {
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
        updateDisplay(row, column);
        //board[row][column].setDisplayValue((char) (countAdjacentMines(row, column) + '0'));
        return true;
      }
      else
        return false;
  }

  private void updateDisplay(int row, int column) {
    if (row == 0 || row == board.length-1 || column == 0 || column == board.length-1)
      return;
    if (board[row][column].containsMine() || board[row][column].updated())
      return;
    int count = countAdjacentMines(row, column);
    board[row][column].setDisplayValue((char) (count + '0'));
    board[row][column].update();
    if (count == 0) {
      for (int i=-1; i<=1; i++)
        for (int j=-1; j<=1; j++)
          updateDisplay(row+i, column+j);
    }
  }

  /**
  * format the board for printing
  * @param peek true if entire board is to be displayed, false if just the guesses
  * @return a formatted representation of the board
  */
  public String formatBoard(boolean peek) {
    StringBuilder sb = new StringBuilder("  ");
    for (int i=1; i<board.length-1; i++)
      sb.append(String.format("%3d", i));
    sb.append("\n");
    for (int i=1; i<board.length-1; i++) {
      sb.append(String.format("%3d ", i));
      for (int j=1; j<board.length-1; j++) {
        if (peek && board[i][j].containsMine())
          sb.append("M  ");
        else
          sb.append(board[i][j].getDisplayValue() + "  ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}