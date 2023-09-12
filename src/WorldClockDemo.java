
/**
 * <p> The purpose of this class is to call methods from the WorldClock.java class and print out the WorldClock time.</p>
 * @author Braden Howard
*/
public class WorldClockDemo
{
/**
 * @param args (not used)
 */
   public static void main(String[] args)
   {
      //test WorldClock
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = 3;
      // Prints offset amount
      System.out.println("Offset: " + offset);
      WorldClock wclock = new WorldClock(offset);
      // Prints hours from WorldClock class, which gets hours from superclass Clock
      System.out.println("Hours: " + wclock.getHours());
      // Prints minutes from World Clock class, which gets minutes from superclass Clock
      System.out.println("Minutes: " + wclock.getMinutes());
      // Prints time from World Clock class
      System.out.println("Time: " + wclock.getTime());
   }
}
