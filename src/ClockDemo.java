
/**
 * <p> The purpose of this class is to call the methods from the clock.java class and print the time.</p>
 * @author Braden Howard
* 
*/
public class ClockDemo
{
	/**
	 * @param args (not used)
	 */
   public static void main(String[] args)
   {
      //test Clock
      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      // Prints hours from clock class
      System.out.println("Hours: " + clock.getHours());
      // Prints minutes from clock class
      System.out.println("Minutes: " + clock.getMinutes());
      // Prints time from clock class
      System.out.println("Time: " + clock.getTime());
   }
}
