import java.util.Scanner;

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
		Scanner scanner =new Scanner(System.in);
		boolean bool1;
		boolean bool2;
		bool1=true;
		bool2=false;
		System.out.println(bool1&bool2);
		System.out.println(bool1||bool2); 
	}

	public static void q2() {
		Scanner input =new Scanner(System.in);
		char bool1;
		char bool2;
		System.out.print("Input a lowercase letter: ");
		bool1=input.next().charAt(0);
		System.out.print("Input another lowercase letter: ");
		bool2=input.next().charAt(0);
		System.out.println(bool1<bool2);
		input.close();

	}

	public static void q3() {
		Scanner input =new Scanner(System.in);
		int bool1;
		System.out.print("Input a number: ");
		bool1=input.nextInt();
		System.out.println(0<bool1&&bool1<10);
		input.close();

	}

	public static void q4() {
		Scanner input =new Scanner(System.in);
		int bool1;
		System.out.print("Input a number: ");
		bool1=input.nextInt();
		System.out.println(!(bool1<0||bool1==5));
		input.close();


	}

	public static void q5() {
		Scanner input =new Scanner(System.in);
		String banana1;
		String word1;
		banana1="banana";
		System.out.print("Input a word: ");
		word1=input.nextLine();
		System.out.println(word1==banana1);
		input.close();

	}

	public static void q6() {
		Scanner input =new Scanner(System.in);
		int number1;
		System.out.print("Input a number: ");
		number1=input.nextInt();
		System.out.println(number1%2==0);
		input.close();
		
	}

}
