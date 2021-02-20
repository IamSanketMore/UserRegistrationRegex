import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserRegistration

{

	public void checkFirstName(String firstName)
	{
		//------------Regex------------------
		String regex = "[A-Z]{1}[a-z]{2,}";

		Pattern patternChecker = Pattern.compile(regex);
		Matcher matchChecker = patternChecker.matcher(firstName);

		//-------------Check valid or Not-----
		if(matchChecker.matches())
			System.out.println("Valid First Name");
		else
			System.out.println("InValid First Name");
	}
	public static void main(String args [])
	{
		Scanner scanReader = new Scanner(System.in);

		UserRegistration newName = new UserRegistration();

		System.out.println("Enter First Name:-");
		String FirstName = scanReader.nextLine();
		newName.checkFirstName(FirstName);

		scanReader.close();
	}
}
