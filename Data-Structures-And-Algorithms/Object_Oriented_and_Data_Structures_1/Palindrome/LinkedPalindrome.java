import java.util.InputMismatchException;
/*
 * @author Jacob Gearhart
 * @version 9/21/2021
 * Class using LinkedStack to check if string is a palindrome
 */
public class LinkedPalindrome {
	
	Stack<String> s1;
	Stack<String> s2;
	Stack<String> s3;
	/*
	 * @param s1 LinkedStack
	 * @param s2 LinkedStack 2
	 * @param s3 LinkedStack 3
	 */
	public LinkedPalindrome() {
		this.s1 = new LinkedStack<String>();
		this.s2 = new LinkedStack<String>();
		this.s3 = new LinkedStack<String>();
	}
	/*
	 * @return true or false
	 * Checks if string is palindrome
	 */
	public boolean isPalindrome(String input) {
		for(int i = 0; i < input.length(); i++) {
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
		for(int j = 0; j < input.length(); j++) {
			try {
			s2.push(s1.pop());
			} catch (EmptyCollectionException e) {
				System.out.println("Stack is empty");
			}
		}
		for(int x = 0; x < input.length(); x++) {
			if(s2.peek().equals(s3.peek())) {
				try {
				s2.pop();
				} catch (NullPointerException e) {
					System.out.println("Null Pointer" + "\nS2 size: " + s2.size() + "\n S3 size: " + s3.size());
				}
				try {
				s3.pop();
				} catch (NullPointerException e) {
					System.out.println("Null Pointer" + "\nS2 size: " + s2.size() + "\n S3 size: " + s3.size());
				}
			}
		}
		if(s2.isEmpty() && s3.isEmpty()) {
			System.out.println(input + " is a palindrome");
			return true;
		}
		s1.clear(); s2.clear(); s3.clear();
		System.out.println(input + " is NOT a palindrome");
		return false;
	}
	
	public static void main(String[] args) {
		LinkedPalindrome lp = new LinkedPalindrome();
		String[] words = {"ertyytre", "ftdhtrth", "ryryesrdfg", "abba", "j ieid uaueo p", "ttrrtt", "ioppoi", "a d c c d a"};
		for(int i = 0; i < words.length; i++) {
			try {
			lp.isPalindrome(words[i]);
			} catch (InputMismatchException e) {
				System.out.println("Please input  a string");
			}
		}
	}
}
