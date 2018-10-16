import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateInputLab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(getStringMatchingRegex(scan, "Please enter a valid name (letters only without special characters): ", "^[A-z]+${30}"));

		System.out.println(getStringMatchingRegex(scan, "Please enter a valid email: ",	"[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{2,3}"));

		System.out.println(getStringMatchingRegex(scan, "Please enter a phone number ", "\\d{3}-\\d{3}-\\d{4}"));
	
		System.out.println(getStringMatchingRegex(scan,	"Please enter a valid date in DD/MM/YYYY format", "\\d{2}/\\d{2}/\\d{4}"));
       
		System.out.println ("Goodbye");
		scan.close();
	}


	
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}
	public static String getStringMatchingRegex(Scanner scan, String prompt, String regex) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt); // this is calling the getString() method above 
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");
				isValid = false;
			}
		} while (!isValid);

		return input += " is a valid entry! thank you";
	}
	

	}

