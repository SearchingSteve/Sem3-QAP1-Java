// Author: Stephen Crocker
// Date: 09/18/2024 

package Date;
public class TestDate {
    

    public static void main(String[] args) 
    {
        // Construct two date objects
        Date date1 = new Date(1, 2, 3000);

        // Display the date objects to ensure properly constructed
        System.out.println("\n"+"Date1: " +date1);

        // Set date1 date to 30/12/2024 using simple set methods and display
        date1.setDay(30);
        date1.setMonth(12);
        date1.setYear(2024);
        System.out.println("Date1: " +date1+" updated");

        // Set date1 date to 9/9/1999 using parenthesis set methods and display
        date1.setDate(9, 9, 1999);
        System.out.println("Date1: " +date1+" updated again"+"\n");
    }
}
