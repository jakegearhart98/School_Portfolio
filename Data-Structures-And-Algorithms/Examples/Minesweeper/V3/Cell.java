public class Cell {
  private char displayValue;
  private boolean containsMine;
        
    public Cell() {
        displayValue = '-';
        containsMine = false;
    }

    public char getDisplayValue() {
      return displayValue;
    }

    public void setDisplayValue(char value) {
      displayValue = value;
    }

    public boolean containsMine() {
      return containsMine;
    }

    public void addMine() {
      containsMine = true;
    }

}