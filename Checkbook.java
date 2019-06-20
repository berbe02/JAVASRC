import java.util.Scanner;

/**
 * 
 */

/**
 * @author berbe02
 *
 */
public class Checkbook {
	static double balance;
	static double amount = 0.0;
	static int checknum;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner checkInput = new Scanner(System.in);
		
		// determine opening balance
		
		System.out.print("What is the checking account opening balance: ");	
		balance = checkInput.nextDouble();
		
		// determine first check number
		
		System.out.print("What is the first check number: ");
		checknum = checkInput.nextInt();
		
		//loop until balance is negative
		while (true){
				System.out.print("Enter the check amount for check " + checknum);
				amount = checkInput.nextDouble();
				if (amount < 0.0)
					break;
				balance -= amount;
				if (balance < 0.0) {
					System.out.printf("Account balance is overdrawn! Balance is %3.2f\n", balance);
					break;
				}
				++checknum;
		}
		System.out.printf("\nEnding account balance is %3.2f", balance);
		
		checkInput.close();	
	}
}
