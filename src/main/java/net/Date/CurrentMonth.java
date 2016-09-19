package net.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

class CurrentMonth {
    public static void main(String[] args) {
        //MMM format
        Formatter formatter = new Formatter();
        Calendar cal = Calendar.getInstance();
        formatter.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(formatter);

        //current time
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
        System.out.println(sdf.format(date));

        //Current date and time
        Formatter fmt = new Formatter();
        Calendar c = Calendar.getInstance();
        fmt.format("%tc", c);
        System.out.println(fmt);

    }
}