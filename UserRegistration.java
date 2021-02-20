import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
	public void checkPasswordRule3(String passWord)
	{
		//------------Regex------------------
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}";
		Pattern patternChecker = Pattern.compile(regex);
		Matcher matchChecker = patternChecker.matcher(passWord);

		//-------------Check valid or Not-----
		if(matchChecker.matches())
			System.out.println("Valid Password");
		else
			System.out.println("InValid Password");
	}
	public static void main(String args [])
	{
		Scanner scanReader = new Scanner(System.in);

		UserRegistration passwordObj = new  UserRegistration();

		System.out.println("Enter Password :-");
		String passWord = scanReader.nextLine();
		passwordObj.checkPasswordRule3(passWord);

		scanReader.close();
	}
}
