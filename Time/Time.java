// Author: Stephen Crocker
// Date: 09/18/2024 

package Time;
public class Time {
    
    // Instance variables
    private int hour;
    private int minute;
    private int second;

    // Time constructor
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    // Get hour
    public int getHour(){
        return hour;
    }

    // Get minute
    public int getMinute(){
        return minute;
    }

    // Get second
    public int getSecond(){
        return second;
    }

    // Setters
    // Set hour
    public void setHour(int hour){
        this.hour = hour;
    }

    // Set minute
    public void setMinute(int minute){
        this.minute = minute;
    }

    // Set second
    public void setSecond(int second){
        this.second = second;
    }

    // Set time (hour, minute, second)
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Stringify time
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }

    // Method to push time to the next second
    public Time nextSecond(){
        second++;
        if(second == 60){
            second = 0;
            minute++;
            if(minute == 60){
                minute = 0;
                hour++;
                if(hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Method to pull time to the previous second
    public Time previousSecond(){
        second--;
        if(second == -1){
            second = 59;
            minute--;
            if(minute == -1){
                minute = 59;
                hour--;
                if(hour == -1){
                    hour = 23;
                }
            }
        }
        return this;
    }
}
