
/**
 * <p> The purpose of this class is to print all the clocks created (AlarmClock, WorldClock, Clock). </p>
 * @author Braden Howard
*/
public class ClocksDemo {
	/**
	 * @param args (not used)
	 */
    public static void main(String[] args) {
        Clock clock = new Clock();
        WorldClock worldClock = new WorldClock(3);
        AlarmClock alarmClock = new AlarmClock(20, 20);
        
        // Array of clocks
        Clock[] clocks = {clock, worldClock, alarmClock};
        
        // For loop loops through the array to print out each clock class
        for (int i = 0; i < clocks.length; i++) {
        	Clock type = clocks[i];
            String time = type.getTime();
            System.out.println("Clock: " + type.getClass().getSimpleName());// Citing for .getClass().getSimpleName() at bottom of code[1]
            // Outputs time
            System.out.println("Time: " + time);
            // If class name equals "AlarmClock", then print if alarm is on or off
            if (type.getClass().getSimpleName().equals("AlarmClock")) {// Citing for .getClass().getSimpleName() at bottom of code[1]
            	// Calls isAlarmTime from AlarmClock, Prints if alarm is on or off
                System.out.println(alarmClock.isAlarmTime());
            }
            System.out.println();
            }
            
        }
  
    }

/*
 * References:
 * Used code from Gitnux.com to print out the class name of each class.
 * [1] How can I get the class name of an object in java? Gitnux.com 
 * https://blog.gitnux.com/code/java-get-class-name/ (accessed Jul. 12, 2023). 
 */
