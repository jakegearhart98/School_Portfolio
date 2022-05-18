//Jacob Gearhart
//ArrayLargeInteger

import java.util.List;
import java.util.ArrayList;

	class ArrayLargeInteger implements LargeInteger<ArrayLargeInteger> {
	//Instance Variables
	private List<String> arr;
	private boolean isNeg;
	private int size;
	public ArrayLargeInteger(String input) {
		
		this.arr = new ArrayList<String>();
		
		for(int i = 0; i < input.length(); i++) {
			arr.add(i, (input.substring(i, i + 1)));
			this.size = i + 1;
		}
		if(arr.get(0).compareTo("-") == 0){
			this.isNeg = true;
		}
	}

	@Override
	public int compareTo(ArrayLargeInteger o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LargeInteger<ArrayLargeInteger> add(LargeInteger<ArrayLargeInteger> input) {
		int carry = 0;
		int sum = 0;
		int x, y;
		int maxSize;
		boolean inNeg = false;
		StringBuilder result = new StringBuilder("");
		StringBuilder in = new StringBuilder(input.toString());
		StringBuilder list = new StringBuilder(listToString());
		
		if(in.substring(0, 1).compareTo("-") == 0) {
			in.deleteCharAt(0);
			inNeg = true;
		}
		if(list.substring(0, 1).compareTo("-") == 0) list.deleteCharAt(0);
		
			//check for maxSize
		maxSize = in.length() - 1;
		if(in.length() < list.length()) maxSize = list.length() - 1;
			
			//Start for loop
		for(int i = maxSize; i >= 0; i--) {
			
			//positive addition
		if(isNeg == false && inNeg == false) {
			System.out.println(i);
			x = Character.getNumericValue(list.charAt(i));
			y = Character.getNumericValue(in.charAt(i));
			sum = x + y;
			if(sum > 10) {
				sum = sum - 10;
				carry = 1;
			}
			result.append(sum + carry);
		}
		
		//System.out.println(result);
		}
		LargeInteger<ArrayLargeInteger> large = new ArrayLargeInteger(result.substring(0, result.length()));
		
		return large;
	}

	@Override
	public LargeInteger<ArrayLargeInteger> subtract(LargeInteger<ArrayLargeInteger> input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LargeInteger<ArrayLargeInteger> negate() {
		
		LargeInteger<ArrayLargeInteger> large = new ArrayLargeInteger(listToString());
		
		if(isNeg == false) {
			arr.add(0, "-");
			large = new ArrayLargeInteger(listToString());
			arr.remove(0);
		}
		return large;
	}

	@Override
	public LargeInteger<ArrayLargeInteger> abs() {
		 
		LargeInteger<ArrayLargeInteger> large = new ArrayLargeInteger(listToString());
		
		if(isNeg == true) {
			large = new ArrayLargeInteger(listToString().substring(1, arr.size()));
		}
		return large;
	}

	@Override
	public LargeInteger<ArrayLargeInteger> max(LargeInteger<ArrayLargeInteger> input) {
		int tempSize = size;
		int inputSize = input.toString().length();
		
		LargeInteger<ArrayLargeInteger> large = new ArrayLargeInteger(listToString());
		
		if(input.toString().substring(0,1).compareTo("-") == 0) inputSize = inputSize - 1;
		if (isNeg == true) tempSize = size - 1;
		
		if(large.toString().substring(0,1).compareTo("-") == 0 && input.toString().substring(0, 1).compareTo("-") != 0) return input;
		if(large.toString().substring(0,1).compareTo("-") != 0 && input.toString().substring(0, 1).compareTo("-") == 0) return large;
		
		if(large.toString().substring(0, 1).compareTo("-") == 0 && input.toString().substring(0, 1).compareTo("-") == 0);{
			if(tempSize < inputSize) return large;
			if(inputSize < tempSize) return input;
		}
		
		if(tempSize > inputSize) return large;
		if(inputSize > tempSize) return input;
		
		if(large.toString().substring(0, 1).compareTo("-") == 0 && input.toString().substring(0, 1).compareTo("-") == 0) {
			for(int i = 0; i <= tempSize; i++) {
				if(input.toString().substring(i,i+1).compareTo(large.toString().substring(i, i + 1)) < 0) {
					return large;
				}
			}
			return input;
		}
		
		if(tempSize == inputSize) {
			for(int i = 0; i < tempSize; i++) {
				if(input.toString().substring(i, i + 1).compareTo(large.toString().substring(i, i + 1)) > 0) {
					return input;
				}
			}
			return large;
		}
		
		return large;
	}

	@Override
	public LargeInteger<ArrayLargeInteger> min(LargeInteger<ArrayLargeInteger> input) {
		
		int tempSize = size; //size of list
		int inputSize = input.toString().length(); //size of input
		
		LargeInteger<ArrayLargeInteger> large = new ArrayLargeInteger(listToString());//cast list so return type is correct
		
		if(input.toString().substring(0,1).compareTo("-") == 0) inputSize = inputSize - 1; //if input is negative update size
		if (isNeg == true) tempSize = size - 1; //updates tempSize if negative
		
		if(large.toString().contains("-") && !input.toString().contains("-")) return large;//change to substring for effeciency
		if(!large.toString().contains("-") && input.toString().contains("-")) return input;//change to substring for effeciency
		
		if(large.toString().contains("-") && input.toString().contains("-")) {
			if(tempSize > inputSize) return large;
			if(inputSize > tempSize) return input;
		}
		
		if(tempSize < inputSize) return large;
		if(inputSize < tempSize) return input;
		
		
		
		//If both items are negative the higher valued number would be lesser
		if(large.toString().contains("-") && input.toString().contains("-")) {
			for(int i = 0; i <= tempSize; i++) {
				if(input.toString().substring(i , i + 1).compareTo(large.toString().substring(i, i + 1)) > 0) {
					return input;
				}
			}
			return large;
		}
		
		if(tempSize == inputSize) {
			for(int i = 0; i < tempSize; i++) {
				if(input.toString().substring(i, i + 1).compareTo(large.toString().substring(i, i + 1)) < 0){
					return input;
				}
			}
		
		}
		
		return large;
	}

	@Override
	public int signum() {
		if(isNeg == true) {
			return -1;
		}
		if(arr.get(0).compareTo("-") > 0 || arr.get(0).compareTo("-") < 0) {
			if(size > 1) {
				return 1;
			}
		}
		
		return 0;
	}

	public String inverseListToString(List<Integer> input) {
		StringBuilder temp = new StringBuilder("");
		
		for(int i = size - 1; i >= 0; i--) {
			temp.append(input.get(i).toString());
		}
		String result = temp.toString();
		return result;
	}
	public String listToString() {
		StringBuilder temp = new StringBuilder("");
		
		for(int i = 0; i < arr.size(); i++) {
			temp.append(arr.get(i).toString());
		}
		String result = temp.toString();
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder build = new StringBuilder("");
	    for(int i = 0; i < arr.size(); i++) {
	    	build.append(arr.get(i) + "");
	    }
		return build.toString();
	}

}
