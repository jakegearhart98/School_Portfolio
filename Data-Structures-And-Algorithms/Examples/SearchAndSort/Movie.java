/**
* A class storing basic data pertaining to a movie.
*
* @author  Charles Sheaffer
* @version September 3, 2021
*/

public class Movie implements Comparable<Movie> {
  
  private String name;
  private String director;
  private int year;         
  private int length;     

/**
* Constructs an instance of the movie class based on a given name, director,
* year of release, and running time in minutes.
*
* @param name       the name of the movie
* @param director   the director of the movie
* @param year       the year the movie was released
* @param length     the running time of the movie in minutes
*/
  public Movie(String name, String director, int year, int length) {
    this.name = name;
    this.director = director;
    this.year = year;
    this.length = length;
  }

/**
* Returns the name of the movie.
* @return the name of the movie
*/
  public String getName() {
    return name;
  }

/**
* Returns the director of the movie.
* @return the director of the movie
*/
  public String getDirector() {
    return director;
  }

/**
* Returns the year of release of the movie.
* @return the the year of release of the movie
*/
  public int getYear() {
    return year;
  }

/**
* Returns the running time of the movie.
* @return the running time of the movie in minutes
*/
  public int getLength() {
    return length;
  }

/**
* Changes the name of the movie to the given name.
* @param name the new name of the movie
*/
  public void setName(String name) {
    this.name = name;
  }

/**
* Changes the director of the movie to the given director.
* @param name the new director of the movie
*/
  public void setDirector(String director) {
    this.director = director;
  }

/**
* Changes the release year of the movie to the given year.
* @param name the new release year of the movie
*/
  public void setYear(int year) {
    this.year = year;
  }

/**
* Changes the running time of the movie to the given length.
* @param name the new running time of the movie in minutes
*/
  public void setLength(int length){
    this.length = length;
  }

  public int compareTo(Movie mv) {
    int nameComp = name.compareTo(mv.name);
    if (nameComp != 0) return nameComp;
    int directComp = director.compareTo(mv.director);
    if (nameComp != 0) return nameComp;
    if (year != mv.year) return year - mv.year;
    return length - mv.length;
  }

  @Override
  public int hashCode() {
    int hash = 37;
    hash = 11 * hash + name.hashCode();
    hash = 11 * hash + director.hashCode();
    hash = 11 * hash + year;
    hash = 11 * hash + length;    
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (this == null) return false;
    if (getClass() != obj.getClass()) return false;
    Movie m = (Movie) obj;
    return year == m.year && length == m.length 
           && name.equals(m.name) && director.equals(m.director);
  }

  @Override
  public String toString() {
    return "Name: " + name
         + " Director: " + director
         + " Year: " + year
         + " Length: " + length;
  }

}