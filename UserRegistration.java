import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
	public void checkMobile(String mobileNumber)
	{
		//------------Regex------------------
		String regex = "^[0-9]{2}[ ][0-9]{10}$";
		Pattern patternChecker = Pattern.compile(regex);
		Matcher matchChecker = patternChecker.matcher(mobileNumber);

		//-------------Check valid or Not-----
		if(matchChecker.matches())
			System.out.println("Valid Mobile Number");
		else
			System.out.println("InValid Mobile Number");
	}
	public static void main(String args [])
	{
		Scanner scanReader = new Scanner(System.in);

		UserRegistration mobileObj = new UserRegistration();

		System.out.println("Enter Mobile Number:-");
		String mobileNumber = scanReader.nextLine();
		mobileObj.checkMobile(mobileNumber);

		scanReader.close();
	}
}
