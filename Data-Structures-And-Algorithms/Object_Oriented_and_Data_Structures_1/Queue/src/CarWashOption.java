/*
 * @author Jacob Gearhart
 * @version 10/20/2021
 * Enum type for Car Wash Options
 */
import java.util.Random;
public enum CarWashOption {
	//Time is in seconds
	BASIC(60, 3.00), MID(90, 5.00), DELUXE(120, 7.00),
	PREMIUM(180, 10.00), ULTIMATE(250, 15.00);
	
	private static CarWashOption[] vals = values();
	private static Random gen = new Random();

	//@param time : final int that represents time it takes for wash to finish, unit is in seconds
	//@param cost : final double that represents cost of wash
	private final int time;
	private final double cost;
	
	//Constructor for CarWashOption enum type
	CarWashOption(int time, double cost){
		this.time = time;
		this.cost = cost;
	}
	
	//Returns width
	public int getTime() {
		return time;
	}
	
	//Returns cost
	public double getCost() {
		return cost;
	}
	
	//returns random CarWashOption
	public static CarWashOption getRandomOption() {
		return vals[(gen.nextInt(vals.length))];
		}

}
