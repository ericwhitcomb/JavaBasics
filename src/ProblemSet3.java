
public class ProblemSet3 {

	public static void main(String[] args) {
		
		/*
		 * Question 1
		 * In the function signature below, what is the return type?
		 * 
		 * public float squareRoot(int x)
		 * 
		 * A. public
		 * B. float**
		 * C. squareRoot
		 * D. int
		 */
		
		/*
		 * Question 2
		 * Write the signature of a function called isPrime(). The access 
		 * modifier should be public, the return type should be boolean, 
		 * and it should take a single integer parameter.
		 */
		System.out.println(isPrime(17));
		
		/*
		 * Question 3
		 * Which of the following function signatures has an error?
		 * A. public getAccountBalanace(long accountNumber)**
		 * B. public void displayInTextBox(String string)
		 * C. public int roundToNearestInt(double x)
		 * D. public double getTemperature()
		 */
		
		/*
		 * Question 4
		 * Write a Java function called absoluteValue(). The access modifier
		 * should be public, it should have a return type of double, and it 
		 * should take one double parameter as input. If the double parameter 
		 * is less than 0, it should return that number negated. Otherwise, 
		 * it should return the parameter unchanged.
		 */
		System.out.println(absoluteValue(3.5));
		System.out.println(absoluteValue(-3.5));
		
		/*
		 * Question 5
		 * Write a Java function named calculateTip(). The access modifier 
		 * should be public, it should have a return type of double, and it 
		 * should take as input a double parameter representing the cost of 
		 * a meal at a restaurant. And finally, it should return a double 
		 * equal to 15% of the cost parameter.
		 */
		System.out.println(calculateTip(20.0));
		
		/*
		 * Question 6
		 * Write a Java function called nametagText(). The access modifier 
		 * should be public, the return type should be String, and it should 
		 * take a String parameter called name. In the body of the function, 
		 * return the String "Hello, my name is " with the name parameter 
		 * added to the end. (Hint: use String concatenation.)
		 */
		System.out.println(nametagText("Eric"));
		
		/*
		 * Question 7
		 * Define two functions. The first should be called fahrenheitToCelsius().
		 * It should be a public function with return type double that takes a 
		 * double argument that represents a temperature in Fahrenheit degrees. 
		 * It should return the equivalent temperature in Celsius degrees.
		 * 
		 * To convert from Fahrenheit to Celsius, 
		 * use the formula C = (F − 32) × 5/9.
		 * 
		 * Next, define a function called printTemperature(). It should be public, 
		 * it should have a return type of void, and it should take a double 
		 * parameter that represents a temperature in Fahrenheit degrees. This 
		 * function should print “F: ” followed by the Fahrenheit parameter, then 
		 * “C: ” followed by the equivalent value in Celsius degrees. Use the 
		 * first function you defined to calculate the appropriate Celsius value 
		 * inside the second function.
		 * 
		 * Bonus challenge: write javadoc comments for both functions.
		 */
		printTemperature(72);
		
		/*
		 * Question 8
		 * Define a function called monopolyRoll(). This function provides a 
		 * random result based on the dice-rolling rules for the board game 
		 * Monopoly. In Monopoly, players roll two six-sided dice to determine 
		 * their move. If they roll the same value on both dice, this is 
		 * called “rolling doubles,” and it means they go again. In our 
		 * simplified version, the dice-roll function should behave like this:
		 * 
		 * 1. Generate two random integers in the 1 to 6 range.
		 * 2. If the numbers are not the same, return the sum.
		 * 3. If the numbers are the same, generate two more random integers 
		 *    in the 1 to 6 range, and return the sum of all 4 numbers.
		 * 
		 * Hint: to make your code neater, you can define a second function 
		 * that generates a random integer in the 1 to 6 range (or in the 1 
		 * to x range based on a parameter) so that you do not need to keep 
		 * repeating that code.
		 */
		System.out.println(monopolyRoll());
	}
	
	/**
	 * For question 2
	 * 
	 * @param n integer
	 * @return boolean
	 */
	public static boolean isPrime(int n) {
		// here is where the code would go to check for prime number
		return true;
	}
	
	/**
	 * For question 4
	 * 
	 * @param n double
	 * @return double
	 */
	public static double absoluteValue(double n) {
		if (n < 0) {
			n = n * -1;
		}
		return n;
	}
	
	/**
	 * For question 5
	 * 
	 * @param cost double
	 * @return double
	 */
	public static double calculateTip(double cost) {
		return cost * 0.15;
	}
	
	/**
	 * For question 6
	 * 
	 * @param name String
	 * @return String
	 */
	public static String nametagText(String name) {
		return "Hello, my name is " + name;
	}
	
	/**
	 * For question 7
	 * 
	 * @param f double
	 * @return double
	 */
	public static double fahrenheitToCelsius(double f) {
		return (f - 32) * 5 / 9;
	}
	
	/**
	 * For question 7
	 * 
	 * @param t double
	 */
	public static void printTemperature(double t) {
		System.out.println("F: " + t);
		System.out.println("C: " + fahrenheitToCelsius(t));
	}
	
	/**
	 * For question 8
	 * 
	 * @return integer
	 */
	public static int monopolyRoll() {
		int d1 = diceRoll(6);
		int d2 = diceRoll(6);
		
		int total = d1 + d2;
		if (d1 == d2) {
			d1 = diceRoll(6);
			d2 = diceRoll(6);
			total = total + d1 + d2;
		}
		
		return total;
	}
	
	/**
	 * For question 8
	 * 
	 * @return integer
	 */
	public static int diceRoll(int sides) {
		double randomNumber = Math.random();
		randomNumber = randomNumber * sides;
		randomNumber = randomNumber + 1;
		return (int) randomNumber;
	}
}
