public class Cell {
  private char displayValue;
  private boolean containsMine;
  private boolean updated;
        
    public Cell() {
        displayValue = '-';
        containsMine = false;
        updated = false;
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

    public boolean updated() {
      return updated;
    }

    public void update() {
      updated = true;
    }

}