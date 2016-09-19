package net.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FifthProg {
    public static void main(String[] args){

        System.out.println("Please enter first date");
        Date date = new Date();
        System.out.println("Todays date is:"+date);
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        LocalDate ld = LocalDate.of(2012,6,24);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("D/M/YY");
        System.out.println(d.format(ld));

    }

}
