package sample;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SetupTest {
	private String testDate;
	   private SimpleDateFormat format;
	   
	   @Before
	   public void setupFormat()
	   {
	       format = new SimpleDateFormat("mm/DD/yyyy");
	   }

	   @Before
	   public void setupDate()
	   {
	       testDate = "01/01/2000";
	       System.out.println("Data ready");
	   }
	   
	 
	   @Test
	   public void format() throws ParseException
	   {
	       Date test = format.parse(testDate);
	   }

	   @Test(expected=ParseException.class)
	   public void badFormatTest() throws ParseException
	   {
	       testDate = "abcd";
	       Date test = format.parse(testDate);
	   }

	   @Before
	   public void myFunSetup()
	   {
	       System.out.println("I ran too");
	   }
}
