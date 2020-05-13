package rizqifauzan.calculator;

import java.util.regex.Pattern;

public class Email {

	public boolean checkEmail(String email) {

		String emailRegex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();

	}

}
