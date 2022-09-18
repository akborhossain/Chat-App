package com.friends.chatapp.time;
import java.util.Calendar;


public class DateTimeInt {

    public static long getCurrentDateInMilliseconds(){
            return Calendar.getInstance().getTimeInMillis();
    }
}
