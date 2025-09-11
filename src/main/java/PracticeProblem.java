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
		//Write question 1 code here
        Scanner reader = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String prompt = reader.nextLine();
		System.out.println(Integer.parseInt("5" + prompt) + 5);
	}
	public static void q2() {
		//Write question 2 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("Input a number: ");
		String prompt1 = reader.nextLine();
		System.out.println(Double.parseDouble("4" + prompt1 + "3") + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String prompt2 = reader.nextLine();
		boolean value = Boolean.parseBoolean(prompt2);
		boolean swap = !value;
		System.out.println(swap);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String prompt3 = reader.nextLine(); 
		String combine = (prompt3 + 3);
		int num = Integer.parseInt(combine);
		num += 2;
		char result = (char) num;
		System.out.println(result);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String prompt4 = reader.nextLine();
		String combine1 = prompt4 + "1";
		int number = Integer.parseInt(combine1);
		double result1 = number / 2;
		System.out.println(result1);
	}

	

	public static void q6() {
		//Write question 6 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("Input a number: ");
		String prompt5 = reader.nextLine();
		double input2 = Double.parseDouble("1" + prompt5);
		int input3 = (int) input2;
		System.out.println(input3);
	}

}
