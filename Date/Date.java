// Author: Stephen Crocker
// Date: 09/18/2024 

package Date;
public class Date {

    // Instance variables
    private int day;
    private int month;
    private int year;


    // Date constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters
    // Get day
    public int getDay(){
        return day;
    }

    // Get month
    public int getMonth(){
        return month;
    }

    // Get year
    public int getYear(){
        return year;
    }

    // Setters
    // Set day
    public void setDay(int day){
        this.day = day;
    }

    // Set month
    public void setMonth(int month){
        this.month = month;
    }

    // Set year
    public void setYear(int year){
        this.year = year;
    }

    // Set date (day, month, year)
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Stringify date
    public String toString(){
        return day + "/" + month + "/" + year;
    }

}
