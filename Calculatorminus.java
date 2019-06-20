import java.util.Scanner;

class Calculatorminus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bernie = new Scanner(System.in);
		int fnum, snum, answer;
		System.out.println("Please enter first number: ");	
		fnum = bernie.nextInt();
		System.out.println("Please Enter second number: ");
		snum = bernie.nextInt();
		answer = fnum - snum;
		System.out.println(answer);
	}

}
