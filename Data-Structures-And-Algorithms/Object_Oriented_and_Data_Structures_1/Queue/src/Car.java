/*
 * @author Jacob Gearhart
 * @version 10/20/2021
 */
public class Car {
	
	//@param current : assigns object CarWashOption current to random carwashoption enum type
	//@param timeRemaining : int that stores timeRemaining for each car
	
	CarWashOption current = CarWashOption.getRandomOption();
	private int timeRemaining;
	
	//Constructor for Car object
	public Car(CarWashOption current) {
		this.current = current;
		timeRemaining = current.getTime();
	}
	//function for decreasing time by 1
	public void decreaseTime() {
		timeRemaining--;
	}
	//returns timeRemaining
	public int getTimeRemaining() {
		return timeRemaining;
	}
	//May not need this at all
	public CarWashOption getCarWashOption() {
		return current;
	}
}
