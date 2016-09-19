package net.Date;

import java.text.DateFormatSymbols;

public class WeekDays {
    public static void main(String[] args) {
        String[] weekdays = new DateFormatSymbols().getWeekdays();

        for (int i = 2; i < (weekdays.length - 1); i++) {

            System.out.println(weekdays[i]);
        }
    }
}
