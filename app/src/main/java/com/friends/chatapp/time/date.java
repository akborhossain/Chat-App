package com.friends.chatapp.time;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    Date currentdate= Calendar.getInstance().getTime();
    String formatteddate= DateFormat.getDateInstance(DateFormat.FULL).format(currentdate);
    String[] splitdate= formatteddate.split(",");
    String[] dateFunction(){

        return splitdate;
    }
}
