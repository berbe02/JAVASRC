import java.util.Scanner;

class Calculatoradd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bernie = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Please enter first number: ");	
		fnum = bernie.nextDouble();
		System.out.println("Please Enter second number: ");
		snum = bernie.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}

}
