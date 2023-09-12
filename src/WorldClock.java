
/**
 * <p> The purpose of this class is to return the time of the World Clock. </p>
 * @author Braden Howard
*/
public class WorldClock extends Clock{
	private int offset;
	/**
	 * <p>This constructors sets the offset of he WorldClock as passed</p>
	 * <p>Exceptions:</p>
     * <p>Does not validate the offset</p> 
	 * @param offset of WorldClock
	 */
	public WorldClock(int offset) {
		this.offset = offset;
	}
	/**
	 * This method returns the Time of the WorldClock
	 * @return the WorldClock time
	 */
	@Override
	public String getTime() {
		/* 
		 * Adds amount of offset to hours for World Clock time
		 * Calls getHours method from super class Clock.java
		 */
		int hours = Integer.valueOf(super.getHours()) + offset;// Citing for valueOf() method below code[1]
		String minutes = super.getMinutes();// Calls getMinutes method from super class Clock.java
		// If hours are less than or equal to 24 after adjusting for offset subtract 24
		if (hours >= 24) {
            hours = hours - 24;
        }
		// If hours are less than 0 after adjusting for offset add 24
        if (hours < 0) {
            hours = hours + 24;
        }
        // Return time as a String
        String time = hours + ":" + minutes;
        return time;
	}
}

/*
 * References:
 * Found how to get int value of a string from javaTpoint, citing below.
 * [1] Java Integer valueof() Method. javaTpoint.com. 
 * https://www.javatpoint.com/java-integer-valueof-method (accessed Jul. 16, 2023). 
 */
