import java.util.Scanner;

/**
		* File: Lesson 1.6 - Booleans
		* Author: Tom Leung
		* Date Created: February 23, 2026
		* Date Last Modified: February 23, 2026
		*/
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Boolean a;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input a boolean: ");
		a = ip.nextBoolean();
		ip.nextLine();
		System.out.println(a);

	}

	public static void q2() {
		//Write question 2 code here
		int a;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input an integer: ");
		a = ip.nextInt();
		ip.nextLine();
		System.out.println(a>5);
	}

	public static void q3() {
		//Write question 3 code here
		String a;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input pizza: ");
		a = ip.nextLine();
		System.out.println(a.equals("pizza"));
	}

	public static void q4() {
		//Write question 4 code here
		Double a;
		Scanner ip = new Scanner (System.in);
		System.out.print("Input a number: ");
		a = ip.nextDouble();
		ip.nextLine();
		System.out.println(a==0);
	}

	public static void q5() {
		//Write question 5 code here
		int a;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input an integer: ");
		a = ip.nextInt();
		ip.nextLine();
		System.out.println(a!=0);

	}

	public static void q6() {
        String a;
		int b;
		Scanner ip = new Scanner ( System.in);
		System.out.print("Input a word earlier than google: ");
		a = ip.nextLine();
		b= a.compareTo("google");
		System.out.println(b<0);
	}

}
