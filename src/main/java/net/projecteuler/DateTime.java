package net.projecteuler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class DateTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int attempt = 1;
        while (attempt <= 3) {
            System.out.println("Please enter date1: ");
            String date1 = input.nextLine();
            System.out.println("Please enter date2: ");
            String date2 = input.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                Date parseDate1 = dateFormat.parse(date1);
                Date parseDate2 = dateFormat.parse(date2);
                System.out.println("Date1 is : " + parseDate1 + " Date2 is : " + parseDate2);

                //difference in date
                long duration = Math.abs(parseDate2.getTime() - parseDate1.getTime());
                System.out.printf("Difference between date1 and date2 is :\n %d ms ", duration);
                System.out.printf("Difference in hours is:\n %d hrs", duration / (60 * 60 * 1000));
                System.out.printf("Difference in days is :\n %d days", duration / (24 * 60 * 60 * 1000));
                break;

            } catch (ParseException ex) {
                System.out.println("Invalid dates. Please try again.");
                attempt++;
            }


        }

    }
}