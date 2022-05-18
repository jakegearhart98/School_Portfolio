
public class driver {
	public static void main(String[] args) {
		LargeInteger arrayInt = new ArrayLargeInteger("123812");//greater
		LargeInteger arrayInt2 = new ArrayLargeInteger("4234");//smaller
		//LargeInteger linkedInt = new LinkedLargeInteger("1065498765452132168798798431324657984321685701");
		//LargeInteger linkedInt2 = new LinkedLargeInteger("-3675001");
		System.out.println(arrayInt.max(arrayInt2));
		System.out.println(arrayInt2.min(arrayInt));
		System.out.println(arrayInt.signum());
		System.out.println(arrayInt2.signum());
		
	}//end main
}
