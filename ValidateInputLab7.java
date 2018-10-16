import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateInputLab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(ValidationMethods.getStringMatchingRegex(scan, "Please enter a valid name (letters only without special characters): ", "^[A-z]+${30}"));

		System.out.println(ValidationMethods.getStringMatchingRegex(scan, "Please enter a valid email: ",	"[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{2,3}"));

		System.out.println(ValidationMethods.getStringMatchingRegex(scan, "Please enter a phone number ", "\\d{3}-\\d{3}-\\d{4}"));
	
		System.out.println(ValidationMethods.getStringMatchingRegex(scan,	"Please enter a valid date in DD/MM/YYYY format", "\\d{2}/\\d{2}/\\d{4}"));
       
		System.out.println ("Goodbye");
		scan.close();
	}

}
