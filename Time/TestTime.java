// Author: Stephen Crocker
// Date: 09/18/2024 

package Time;
public class TestTime {
    
    public static void main(String[] args) {
        // Construct two time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0,0,0);

        // Display the time objects to ensure properly constructed
        System.out.println("\n"+"t1: "+t1);
        System.out.println("t1: "+t2+"\n");

        // Set t1 time to 21:10:15 using simple set methods and display
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(25);
        System.out.println("t1 updated: "+t1);

        // Set t2 time to 10:20:25 using parenthesis set methods and display
        t2.setTime(10, 20, 25);
        System.out.println("t2 updated: "+t2+"\n");

        // Call nextSecond() on t1 and display
        t1.nextSecond();
        System.out.println("t1 1 second after: "+t1);
        // Call previousSecond() on t2 and display
        t2.previousSecond();
        System.out.println("t2 1 second before: "+t2+"\n");

        // Display the final times for t1 and t2 using toString() method
        System.out.println("t1 stringified: "+t1.toString());
        System.out.println("t2 stringified: "+t2.toString()+"\n");
    }
}
