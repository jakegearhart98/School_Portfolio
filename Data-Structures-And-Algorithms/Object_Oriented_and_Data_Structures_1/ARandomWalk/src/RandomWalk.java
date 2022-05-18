/*
 * @author Jacob Gearhart
 * @version 9/7/2021
 * Project 1: A Random Walk
 * Simulates "bug" randomly walking around room and prints room
 */

import java.util.Random;
public class RandomWalk {
	/*
	 * @param walkArr: array to track number of times each tile is visited
	 * @param bugX: int to track the "x" location of bug
	 * @param bugY: int to track the "y" location of bug
	 * @param stepCount: int to track number of steps taken
	 */
	private int walkArr [][];
	private int bugX;
	private int bugY;
	private int stepCount;
	
	/*
	 * Initializes walkArr and bugX and bugY
	 */
	public RandomWalk(int row, int column){
		walkArr =  new int [row][column];
		bugX = ((row/2) - 1);
		bugY = ((column/2) - 1);
	}
	public void setBugX(int bugX) {
		this.bugX = bugX;
	}
	public void setBugY(int bugY) {
		this.bugY = bugY;
	}
	/*
	 * Runs random bug simulation and checks if all spaces have been visited
	 */
	public void runBug() {
		boolean completed = false;
		int count = 0;
		walkArr[(walkArr.length/2) -1][(walkArr.length/2) -1] = 1;
		while(completed == false) {
				generateNextMove();
				getTotalSteps();
			if (doneCheck() == true) {
				count += 1;
				if (count == ((walkArr.length * walkArr[0].length) )){
					completed = true;
				}
			}	
		}
	}
	
	/*
	 * Prints walkArr formatted properly and prints steps taken
	 */
	public void printRoom() {
		for(int i = 0; i < walkArr.length; i++) {
			System.out.print("\n");
			for(int j = 0; j < walkArr[i].length; j++) {
				System.out.print(walkArr[i][j] + "\t");
			}
		}
		System.out.println("\n\nSteps taken: " + stepCount);
	}
	/*
	 * @throws ArrayIndexOutOfBoundsException
	 * Checks if moves are valid and randomly moves bug
	 */
	private void generateNextMove() {
		Random gen = new Random();
		
		boolean done = false;
		
		while(done == false) {
			int step = gen.nextInt(3)-1;
			int step2 = gen.nextInt(3)-1;
			if(bugX + step == bugX && bugY + step2 == bugY) {
				step = gen.nextInt(3)-1;
				step2 = gen.nextInt(3)-1;
			}
			try {
				walkArr[bugX + step][bugY + step2] += 1;
				setBugX(bugX + step);
				setBugY(bugY + step2);
				done = true;
			} catch (ArrayIndexOutOfBoundsException e) {
				done = false;
			}
		}
	}
	/*
	 * Checks if every item in array has a value of greater than zero
	 */
	private boolean doneCheck() {
		boolean complete = false;
		int count = 0;
		for(int i = 0; i < walkArr.length; i++) {
			for(int j = 0; j < walkArr[i].length; j++) {
				if (walkArr[i][j] == 0) {
					break;
				}
				if (walkArr[i][j] > 0) {
					count += 1;
				}
			}
		}
		if(count == walkArr.length * walkArr[0].length) {
			complete = true;
		}
		return complete;
	}
	/*
	 *Increments stepCount by +1
	 *@return stepCount
	 */
	public int getTotalSteps() {
		stepCount++;
		return stepCount;
	}
	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
		RandomWalk ran = new RandomWalk(10,10);
		ran.runBug();
		ran.printRoom();
		}
		
	}
}
