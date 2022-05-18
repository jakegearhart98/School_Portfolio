import java.util.InputMismatchException;
/*
 * @author Jacob Gearhart
 * @version 9/21/2021
 * Class using ArrayStack to check if string is a palindrome
 */
public class ArrayPalindrome {
	
	private Stack<String> s1 ,s2, s3;
	/*
	 * @param s1 ArrayStack
	 * @param s2 ArrayStack 2
	 * @param s3 ArrayStack 3
	 */
	
 	public ArrayPalindrome() {
		this.s1 = new ArrayStack<String>();
		this.s2 = new ArrayStack<String>();
		this.s3 = new ArrayStack<String>();
	}
 	/*
 	 * Checks if string is palindrome
 	 */
	public boolean isPalindrome(String input) {
		for (int i = 0; i < input.length(); i++) {
			try {
			s1.push(String.valueOf(input.charAt(i)));
			} catch (NullPointerException e) {
				System.out.println("Null Pointer" + "\nS1 size: " + s1.size() + "\n S3 size: " + s3.size());
			}
			try {
			s3.push(String.valueOf(input.charAt(i)));
			} catch (NullPointerException e) {
				System.out.println("Null Pointer" + "\nS1 size: " + s1.size() + "\n S3 size: " + s3.size());
			}
		}
		
		for(int i = 0; i < input.length(); i++) {
			try {
			s2.push(s1.pop());
			} catch (EmptyCollectionException e) {
				System.out.println("Stack is empty");
			}
		}
		
		for(int i = 0; i < input.length(); i++) {
			if (s2.peek().equals(s3.peek())) {
				try {
				s2.pop();
				} catch (NullPointerException e) {
					System.out.println("Null Pointer" + "\nS2 size: " + s2.size() + "\n S3 size: " + s3.size());
				}
				try {
				s3.pop();
				} catch (NullPointerException e) {
					System.out.println("Null Pointer" + "\nS1 size: " + s2.size() + "\n S3 size: " + s3.size());
				}
			}
		}
		
		if (s2.isEmpty() == true && s3.isEmpty() == true) {
			System.out.println(input + " is a palindrome");
			s1.clear(); s2.clear(); s3.clear();
			return true;
		}
		System.out.println(input + " is NOT a palindrome");
		s1.clear(); s2.clear(); s3.clear();
		return false;
	}
	public static void main(String[] args) {
		ArrayPalindrome p = new ArrayPalindrome();
		String[] strings = {"rdedr", "wersdfg", "abba", "a b b a", "a c b d a", "ttyytt", "ertsetfsdg"};
		for (int i = 0; i < strings.length; i++) {
			try {
			p.isPalindrome(strings[i]);
			} catch (InputMismatchException e) {
				System.out.println("Please input a string");
			}
		}
		
	}//end main
}//end ArrayPalindrome


