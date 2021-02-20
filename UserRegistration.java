import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
	public void checkEmail(String emailId)
	{
		//------------Regex------------------
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";
		Pattern patternChecker = Pattern.compile(regex);
		Matcher matchChecker = patternChecker.matcher(emailId);

		//-------------Check valid or Not-----
		if(matchChecker.matches())
			System.out.println("Valid Email");
		else
			System.out.println("InValid Email");
	}
	public static void main(String args [])
	{
		Scanner scanReader = new Scanner(System.in);

		UserRegistration newName = new UserRegistration();
		System.out.println("Enter Email:-");
		String email = scanReader.nextLine();
		newName.checkEmail(email);

		scanReader.close();
	}
}

