public class IntArrayStack {
	
	private int [] data;
	private int top;

	public IntArrayStack(int capacity) {
		data = new int[capacity];
		top = 0;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top == data.length;
	}

	public int peek() {
		return data[top - 1];
	}

	public void push(int datum) {
		data[top] = datum;
		top++;
	}

	public int pop() {
		int datum = peek();
		top--;
		return datum;
	}

	public void clear() {
		top = 0;
	}

	public String toString() {
		String out = "[";
		for (int i=0; i<top-1; i++)
			out += (data[i] + ", ");
		if (!isEmpty())
			out += data[top-1];
		out += "]";
		return out;
	}

	public static void main(String[] args) {
		IntArrayStack as1 = new IntArrayStack(10);
		System.out.println(as1.isEmpty());
		as1.push(5);
		as1.push(6);
		as1.push(3);
		System.out.println(as1);
		System.out.println(as1.isEmpty());

		int item = as1.pop();
		System.out.println(item);
		System.out.println(as1);
		item = as1.pop();
		item = as1.pop();
		item = as1.pop();

	}
}