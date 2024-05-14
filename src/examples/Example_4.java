package examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example_4 {

	public static void main(String[] args) {

		String ourDatePattern = "MM-dd-yyyy";
		Date myDate = new Date();
		System.out.println(makeDateToSpecificFormat(ourDatePattern, myDate));

	}

	// Format Date to Specific Date Format
	private static String makeDateToSpecificFormat(String ourDatePattern, Date myDate) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ourDatePattern);
		String myFormattedDate = simpleDateFormat.format(myDate);
		return myFormattedDate;
	}

}
