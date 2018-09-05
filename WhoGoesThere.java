import java.util.Scanner;
public class WhoGoesThere{
	public static void main(String[] args){
		Scanner inputDevice = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int age;
		
		System.out.print("Please inter your first name: ");
		firstName = inputDevice.nextLine();
		System.out.print("Please enter your last name: ");
		lastName = inputDevice.nextLine();
		System.out.print("Please enter your age: ");
		age = inputDevice.nextInt();
		System.out.println("");
		
		System.out.println("As long as you are over the age of " + (age - 10) + " then\n" +
		"you are free to pass, " + firstName + " " + lastName + "!");
	}
}