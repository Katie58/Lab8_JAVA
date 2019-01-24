package lab8;
import java.util.Scanner;

public class StudentInfo {
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean retry = true;
		int student;
		int info;
		
		greeting();
		while(retry) {
			student = userInputStudent();
			while(retry) {
				info = userInputInfo(student);
				printInfo(student, info);
				retry = retry(student);
			}		
			retry = retry();
		}
		exit();
		scnr.close();
	}
	
	private static void greeting() {//program title/greeting
		System.out.println("Welcome to out Java class!");
	}	
	
	private static int userInputStudent() {//returns student index
		System.out.println("Which student would you like to learn more about? (enter a number 1-" + (Students.javaClass().size() - 1) + "): ");	
		return validateInputRange(Students.javaClass().size() - 1);

	}
	
	private static int userInputInfo(int student) {//return student info index
		System.out.println("What would you like to know about " + Students.getFirstName(student) + "?");
		for (int i = 1; i < Students.getStudent(0).size(); i++) {
			System.out.println(i + ". " + Students.getStudent(0).get(i));
		}	
		return validateInputRange(Students.getStudent(0).size() - 1);
	}
	
	private static int validateInputRange(int max) {
		int input = 0;
		while (input == 0) {
			if (scnr.hasNextInt()) {
				input = scnr.nextInt();
				scnr.nextLine();
				try {
					if (input < 1 || input > max) {
						System.out.println("Congratulations, you entered a number! Perhaps you are capable of entering one between 1-" + max + "... ");
						input = 0;
					}					
				} catch (IndexOutOfBoundsException ex) {
					System.out.println("Oops, that data is unavailable...");
				}
			} else {
				scnr.nextLine();
				System.out.println("That's not even a valid number, try again... ");
			}
		}
		return input;
	}
	
	private static void printInfo(int student, int info) {
		System.out.println(Students.getFirstName(student) + "'s " + Students.getStudent(0).get(info) + " is " + Students.getStudent(student).get(info));
	}
	
	private static boolean retry() {//loop program
		System.out.println("Choose another Student?");
		return retry(scnr.nextLine().charAt(0));
	}
	
	private static boolean retry(int student) {//loop student
		System.out.println("Would you like to know more about " + Students.getFirstName(student) + "?");
		return retry(scnr.nextLine().charAt(0));
	}
	
	private static boolean retry(char input) {//validate yes or no 
		while (input != 'y' && input != 'Y' && input != 'n' && input != 'N') {
			System.out.println("This is a simple yes or no question, try again...");
			input = scnr.nextLine().charAt(0);
		}
		return (input == 'y' || input == 'Y');
	}
	
	private static void exit() {//exit message
		System.out.println("GOODBYE!");
	}

}
