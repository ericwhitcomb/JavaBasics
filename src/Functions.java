
public class Functions {

	public static void main(String[] args) {
		
		function1();
		
		function2(3);
		
		int r = function3();
		System.out.println("Return value = " + r);
		
		r = function4(3);
		System.out.println("Return value = " + r);
		
		function5("Potter", "Harry");
	}

	// no parameters, no return result
	public static void function1() {
		System.out.println("function1(): parameters: none, return: none");
	}
	
	// with parameters, no return result
	public static void function2(int n) {
		System.out.println("function2(): parameters: n = " + n + ", return: none");
	}
	
	// no parameters, with return result
	public static int function3() {
		System.out.println("function1(): parameters: none, return: 0");
		return 0;
	}
	
	// with parameters, with return result
	public static int function4(int n) {
		int m = n*n;
		System.out.println("function1(): parameters: n = " + n + ", return: n*n = " + m);
		return m;
	}
	
	// order of arguments example
	public static void function5(String firstName, String lastName) {
		System.out.println("function5(): First Name = " + firstName +
				", Last Name = " + lastName);
	}

}
