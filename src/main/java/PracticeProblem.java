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
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        boolean result = (number >= 0 && number <= 10);
        System.out.println(result);

	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double number = scanner.nextDouble();
        boolean result = (number > 0 && number != 5);
        System.out.println(result);


	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        boolean result = !word.equals("banana");
        System.out.println(result);

	}

	public static void q6() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        boolean result = (number % 2 == 0);
        System.out.println("The integer " + number + " is " + result);
		
	}

}
