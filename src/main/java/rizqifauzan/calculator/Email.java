package rizqifauzan.calculator;

import java.util.regex.Pattern;

public class Email {

	public boolean checkEmail(String email) {

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\\\.\" + \"[a-zA-Z0-\n" + 
				"9_+&*-]+)*@\" + \"(?:[a-zA-Z0-9-]+\\\\.)+[a-z\"\n" + 
				"+ \"A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();

	}

}
