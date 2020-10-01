package Section21_40_Questions;

import java.util.Scanner;

/*   Question: Validate a password-
              i) there should be atleast one digit
             ii) there should be atleast one of '#','@' or '$' .
            iii)the password should be of 6 to 20 characters
             iv) there should be more uppercase letter than lower case.
              v) should start with an upper case and end with lower case.*/
//Shahin1@...invalid pass
//Shahin1@#s...valid pass
public class ValidatePassword_Q24 {

	public static void main(String[] args) {
	

		Scanner se = new Scanner(System.in);
		System.out.println("Enter password:=");
		String n = se.next();

		int count = 0;
//check lenght
		if (n.length() >= 8) {
			count++;
		}

// special character		
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '@' || n.charAt(i) == '/' || n.charAt(i) == '_' || n.charAt(i) == '#') {
				count++;
				break;
			}
		}
//Start with upper or low case
		if ((n.charAt(0) >= 'a' && n.charAt(0) <= 'z') || (n.charAt(0) >= 'A' && n.charAt(0) <= 'Z')) {
			count++;
		}

//if want small case character upper character digit 		
		if ((n.charAt(n.length() - 1) >= 'a' && n.charAt(n.length() - 1) <= 'z')
				|| (n.charAt(n.length() - 1) >= 'A' && n.charAt(n.length() - 1) <= 'Z')
				|| (n.charAt(n.length() - 1) >= '0' && n.charAt(n.length() - 1) <= '9')) {
			count++;
		}
// digit availabale is 
		for (int i = 0; i < n.length(); i++) {
			if (Character.isDigit(n.charAt(i))) {
				count++;
				break;
			}
		}
//lower and upper character
		for (int i = 0; i < n.length(); i++) {
			if ((n.charAt(i) >= 'a' && n.charAt(i) <= 'z') || (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')) {
				count++;
				break;
			}
		}
//valid final outpute
		if (count == 6) {
			System.out.println("Valid Password");
		} else {
			System.out.println("In-Valid Password");
		}

	}

}

