
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
 * <p>The purpose of this class is to get the local time in hours and minutes, and return the time as a string.</p>
 * @author Braden Howard
* 
* <p>Exceptions:</p>
* <p>Current time is taken from the system default</p>
*/
public class Clock {
	String timeString = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).toString();// Citing below [1]
	/**
	 * This method returns the hours as a String.
	 * @return the hours for the Clock
	 */
	public String getHours() {
		// Takes specific index of string to get hours
		String hours = timeString.substring(11, 13);// Citing for substring below code [2]
		return hours;
	}

	/**
	 * This method returns the minutes as a String.
	 * @return the minutes for the Clock
	 */
	public String getMinutes() {
		// Takes specific index of string to get hours
		String minutes = timeString.substring(14, 16);// Citing for substring below code [2]
		return minutes;
	}


	/**
	 * This method returns the time as a String.
	 * @return the time for the Clock
	 */
	public String getTime() {
		// Puts hours and minutes together to create time
		String time = (getHours() + ":" + getMinutes());
		return time;
	}

/*
 * Reference:
 * Learned how to use LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()) from GeeksforGeeks, code givin in assignmnent code.
 * [1] LocalDateTime ofInstant() method in Java with Examples. GeeksforGeeks, 
 * https://www.geeksforgeeks.org/localdatetime-ofinstant-method-in-java-with-examples/ (accessed Jul. 13, 2023). 
 * 
 * Learned how to use substring from javaTpoint.com, reference below.
 * [2] Java string substring() method. javaTpoint.com, 
 * https://www.javatpoint.com/java-string-substring (accessed Jul. 13, 2023). 
 */











}
