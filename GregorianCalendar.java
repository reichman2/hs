/*
 * Your task is to write a program that prints:
 * 
 * – The date and weekday(in words not numbers) that is 100 days from today. 
 * – The weekday(in words not numbers) of your birthday. 
 * – The date that is 10,000 days from your birthday.
 *
 * Make sure to utitlize the Java 8 API. 
 * Make sure you have imported the correct classes into your program.
 *
 * Hint: to better understand the GregorianCalendar class, make a couple of test programs to better understand it. 
 * Make a program that constructs tody’s date, adds ten days, and prints out the day of the month and weekday.
 *
 */

import java.util.GregorianCalendar;
import java.util.Calendar;

public class GregorianCalendar extends ConsoleProgram {
    
    private String[] weekday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private String[] month = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    @Override
    public void run() {
        Calendar c = Calendar.getInstance();
        
        Calendar hundredDays = new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        Calendar birthday = new GregorianCalendar(2003, 1, 8);
        Calendar tenThousandDays = new GregorianCalendar(2003, 1, 8);
        
        hundredDays.add(Calendar.DAY_OF_MONTH, 100);
        tenThousandDays.add(Calendar.DAY_OF_MONTH, 10000);
        
        System.out.println("One hundred days from today is " + weekday[hundredDays.get(Calendar.DAY_OF_WEEK) - 1] + ", " + month[hundredDays.get(Calendar.MONTH)] + " " + hundredDays.get(Calendar.DAY_OF_MONTH) + ", " + hundredDays.get(Calendar.YEAR));
        System.out.println("Birthday was on a " + weekday[birthday.get(Calendar.DAY_OF_WEEK) - 1]);
        System.out.println("Ten thousand days from my birthday is " + weekday[tenThousanDays.get(Calendar.DAY_OF_WEEK] + (tenThousandDays.get(Calendar.MONTH) + 1) + "/" + tenThousandDays.get(Calendar.DAY_OF_MONTH) + "/" + tenThousandDays.get(Calendar.YEAR));
        
    }
}
