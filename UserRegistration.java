import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{

	public void checkLastName(String lastName)
	{
		//------------Regex------------------
		String regex = "[A-Z]{1}[a-z]{2,}";

		Pattern patternChecker = Pattern.compile(regex);
		Matcher matchChecker = patternChecker.matcher(lastName);

		//-------------Check valid or Not-----
		if(matchChecker.matches())
			System.out.println("Valid Last Name");
		else
			System.out.println("InValid Last Name");
	}
	public static void main(String args [])
	{
		Scanner scanReader = new Scanner(System.in);

		UserRegistration newName = new UserRegistration();

		System.out.println("Enter First Name:-");
		String LastName = scanReader.nextLine();
		newName.checkLastName(LastName);

		scanReader.close();
	}
}
