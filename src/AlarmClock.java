
/**
 * <p> The purpose of this class is to create an alarm and check to see if the alarm is on or off.</p>
 * @author Braden Howard
 */
public class AlarmClock extends Clock{
	boolean alarmOn = true;
	private int hours;
	private int minutes;
	/**
	 * <p>This constructor sets the hour and minutes of the AlarmClock as passed</p>
	 * <p>Exceptions:</p>
     * <p>Does not validate if time passed is within 24hour time frame</p>
     * <p>Does not validate if time put in is over 23 hours and 59 minutes, ex. 28hr 77min.</p>
	 * @param hours of this AlarmClock
	 * @param minutes of this AlarmClock
	 */
	public AlarmClock(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	/**
	 * This method returns the Time of the alarm clock
	 * @return the alarm time
	 */
	@Override
	public String getTime() {
		// Format the hours and minutes to use 2 places
		String time = String.format("%02d", hours) + ":" + String.format("%02d", minutes);
		return time;
	}
	/**
	 * This method returns the alarm status, on or off
	 * @return alarm status
	 */
	public String isAlarmTime() {
		boolean alarmOn = true;
		// Gets hours from superclass Clock
        int currentHours = Integer.valueOf(super.getHours());// Citing for valueOf() method below code[1]
        // Gets minutes from superclass Clock
        int currentMinutes = Integer.valueOf(super.getMinutes());// Citing for valueOf() method below code[1]
        // AlarmOn if hours is less than hours set on alarm or if the hours are equal but the minutes are less than the minutes set for alarm
        alarmOn = (currentHours < hours) || (currentHours == hours && currentMinutes <= minutes);
        // If alarm has not went off yet it will output "Alarm is still on"
        if (alarmOn) {
        	return "Alarm is still on";
        // If alarm has went off it will output "Alarm is off(Ding ding ding)"
        } else {
        	return "Alarm is off(Ding ding ding)";
        }
    }
}

/*
 * References:
 * Found how to get int value of a string from javaTpoint, citing below.
 * [1] Java Integer valueof() Method. javaTpoint.com. 
 * https://www.javatpoint.com/java-integer-valueof-method (accessed Jul. 16, 2023). 
 */
