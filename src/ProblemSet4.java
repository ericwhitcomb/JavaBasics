
public class ProblemSet4 {

	public static void main(String[] args) {

		/*
		 * Question 1
		 * What will be printed by this block of Java code?
		 * 
		 * A. 10
		 * B. 40
		 * C. 50
		 * D. 80**
		 */
		int n = 10;
		while (n < 50) {
			n = n * 2;
		}
		System.out.println(n);
		
		/*
		 * Question 2
		 * Complete the factorial() function below. It should return the product
		 * of all the numbers from 1 to the parameter n. For example, factorial(5)
		 * should return 120 because 1 x 2 x 3 x 4 x 5 = 120. Think about what 
		 * kind of loop you want to use to accomplish this.
		 */
		System.out.println(factorial(5));
		
		/*
		 * Question 3
		 * Complete the code in this function to find and return the lowest index 
		 * in the String array stringArray that the String target occurs. If the 
		 * String target does not occur in stringArray, -1 should be returned.
		 * 
		 * Hint: you cannot compare two Strings using the == operator! This will be 
		 * false unless the two Strings are actually the same String object, not just 
		 * two Strings with the same letters. To check whether two Strings have the 
		 * same letters, use the equals() method:
		 * 		if (myString1.equals(myString2)).
		 */
		// Should print '1'
		String[] sentence = {"Learning", "Java", "is", "fun."};
		int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
		System.out.println(indexOfWordJava);
		
		/*
		 * Question 4
		 * A savings account yields 5% interest annually. This Java function is
		 * designed to determine how many years it will take for you to have 
		 * $1,000,000 on deposit given an initial value. The parameter represents
		 * the initial deposit, and the function should return an integer number
		 * of years before there will be $1,000,000 or more in the account. 
		 * Write a loop to determine the number of years, and return that value.
		 *    
		 * (Hint: Do we know how many times this loop needs to iterate? 
		 * Does this mean a for loop or a while loop is more appropriate?)
		 */
		System.out.println(yearsTilOneMillion(50000));
		
		/*
		 * Question 5
		 * Complete the Java function below to print out all the Strings in the
		 * String array parameter in reverse order. (The String at the highest 
		 * index should be printed first, then the String at the next highest 
		 * index, and so on. The String at index 0 should be printed last.)
		 * 
		 * For example, if a String array called weekdays had value
		 * 		{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}
		 * then this function call:
		 * 		printInVerverse(weekdays);
		 * would print:
		 * 		Friday
		 * 		Thursday
		 * 		Wednesday
		 * 		Tuesday
		 * 		Monday
		 */
		String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		printInReverse(weekdays);
		
		/*
		 * Question 6
		 * Complete the function below, which finds the range covered by an integer array.
		 * Inside the function, find the smallest value in the parameter array, and find 
		 * the largest value, and return the largest value minus the smallest value. If 
		 * the array has length 0, return -1.
		 * 
		 * For example, if the variable myIntArray had the value
		 * 		{1, 0, 2, 3, -1, 2}
		 * then the function call
		 * 		findRange(myIntArray)
		 * would return 
		 * 		4
		 * The largest value in the array is 3, the smallest value is -1, and 3−(−1) = 4.
		 */
		int[] values = {1, 0, 2, 3, -1, 2};
		System.out.println(findRange(values));
		
		/*
		 * Question 7
		 * What will be printed by this block of Java code?
		 * 
		 * Answer:
		 * #
		 * ##
		 * ###
		 */
		int rows = 3;
		for (int i = 1; i <= rows; i++) {
			String thisRow = "";
			for (int j = 0; j < i; j++) {
				thisRow = thisRow + "#";
			}
			System.out.println(thisRow);
		}
		
		/*
		 * Question 8
		 * Let’s improve the monopolyRoll() function from the previous problem set. 
		 * Recall that in Monopoly, players roll two six-sided dice to determine their 
		 * move. If the same value is on both dice, this is called "rolling doubles," 
		 * and it means they go again. In the last problem set, you wrote a function 
		 * that rolled two six-sided dice and, if the values on both die were the same, 
		 * rolled two more and returned the sum. This time, write a function that does 
		 * the same except it continues rolling until two non-equal values appear on 
		 * the two dice. In other words, the function should behave as follows:
		 * 
		 * 1. Generate two random numbers in the 1 to 6 range.
		 * 2. If they are not the same, return the sum of all numbers rolled so far.
		 * 3. If they are the same, keep track of the total rolled so far and return to
		 *    step 1.
		 *    
		 * Think about what kind of loop you want to define to repeat these steps. 
		 * Again, you may want to define a separate function for generating dice rolls.
		 */
		System.out.println(enhancedMonopolyRoll());
		
		// Optional challenge: in Monopoly, if a player rolls doubles three times in a
		// row, they go to "jail." Modify your function to keep track of the number of 
		// rolls made so far. If three consecutive doubles are rolled, return -1 instead 
		// of continuing to roll.
		System.out.println(enhancedMonopolyRollChallenge1());
		
		// Optional challenge 2: in the last lesson, you learned about while loops and
		// for loops as a way to make a computer program repeat. There is another method 
		// for making a program repeat using only functions called recursion. A 
		// "recursive" function is one which calls itself inside itself. See if you can
		// write the monopolyRoll() function by calling monopolyRoll() inside the 
		// function itself to handle the case where further rolls are made.
		System.out.println(enhancedMonopolyRollChallenge2());
	}
	
	/**
	 * For question 2
	 * 
	 * @param n int
	 * @return int
	 */
	public static int factorial(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total = total * i;
		}
		return total;
	}
	
	/**
	 * For question 3
	 * 
	 * @param stringArray String[]
	 * @param target String
	 * @return int
	 */
	public static int indexOfFirstOccurrence(String[] stringArray, String target) {
		
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * For question 4
	 * 
	 * @param initialBalance double
	 * @return int
	 */
	public static int yearsTilOneMillion(double initialBalance) {
		
		int years = 0;
		double balance = initialBalance;
		while(balance < 1000000) {
			years++;
			balance = balance * 1.05;
		}
		return years;
	}
	
	/**
	 * For question 5
	 * 
	 * @param stringArray String[]
	 */
	public static void printInReverse(String[] stringArray) {
		for (int i = stringArray.length-1; i >= 0; i--) {
			System.out.println(stringArray[i]);
		}
	}

	/**
	 * For question 6
	 * 
	 * @param intArray int[]
	 * @return int
	 */
	public static int findRange(int[] intArray) {
		if (intArray.length == 0) {
			return -1;
		}
		
		int max = intArray[0];
		int min = intArray[0];
		
		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}
		}
		
		return max - min;
	}
	
	/**
	 * For question 8
	 * 
	 * @return integer
	 */
	public static int enhancedMonopolyRoll() {
		int d1 = diceRoll(6);
		int d2 = diceRoll(6);
		
		int total = d1 + d2;
		while (d1 == d2) {
			d1 = diceRoll(6);
			d2 = diceRoll(6);
			total += d1 + d2;		
		}
		
		return total;
	}
	
	/**
	 * For question 8
	 * 
	 * @return integer
	 */
	public static int enhancedMonopolyRollChallenge1() {
		int d1 = diceRoll(6);
		int d2 = diceRoll(6);
		int rollCount = 1;
		
		int total = d1 + d2;
		while (d1 == d2) {
			if (rollCount >= 3) return -1;
			d1 = diceRoll(6);
			d2 = diceRoll(6);
			rollCount++;
			total += d1 + d2;		
		}
		
		return total;
	}
	
	/**
	 * For question 8
	 * 
	 * @return integer
	 */
	public static int enhancedMonopolyRollChallenge2() {
		int d1 = diceRoll(6);
		int d2 = diceRoll(6);
		
		if (d1 == d2) {
			return d1 + d2 + enhancedMonopolyRollChallenge2();
		}
		return d1 + d2;
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
