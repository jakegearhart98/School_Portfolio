import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class City {

  private String name;
  private String state;
  private int population;

  public City(String name, String state, int population) {
    this.name = name;
    this.state = state;
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  @Override
  public int hashCode() {
    int hash = 11;
    hash = 19 * hash + name.hashCode();
    hash = 19 * hash + state. hashCode();
    hash = 19 * hash + population;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (this == null) return false;
    if (getClass() != obj.getClass()) return false;
    City c = (City) obj;
    return population == c.population && name.equals(c.name)
                      && state.equals(c.state);
  }

  @Override 
  public String toString() {
    return name + ", " + state + ", " + population;
  }


  
  public static void main(String[] args) {
    Map<String, City> cities = new HashMap<>();
    cities.put("Seattle", new City("Seattle", "Washington", 3870000));
    cities.put("Minneapolis/St. Paul", new City("Minneapolis/St. Paul", "Minnesota", 3160000));
    cities.put("Denver", new City("Denver", "Colorado", 2860000));
    cities.put("Atlanta", new City("Atlanta", "Georgia", 6090000));
    cities.put("Boston", new City("Boston", "Massachusetts", 4870000));

    Collection<City> sList = cities.values();
    for (City s : sList) {
      System.out.println(s);
    }
    System.out.println();

    Set<String> keys = cities.keySet();
    for (String key : keys) {
      System.out.print(key + " ");
    }
    System.out.println("\n");

    City s1 = cities.get("Seattle");
    s1.setPopulation(3980000);

    for (City s : sList) {
      System.out.println(s);
    }
  }
}