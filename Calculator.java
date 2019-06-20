import java.util.Scanner;

// this is a git change

class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bernie = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");	
		fnum = bernie.nextDouble();
		System.out.println("Enter second num: ");
		snum = bernie.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}

}
