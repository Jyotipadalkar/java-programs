package net.practice;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Trains {
    public static void main(String[] args) {
        LinkedList<String> stations = new LinkedList<String>();
        stations.add("Punjab");
        stations.add("Madhya Pradesh");
        stations.add("Uttar Pradesh");
        stations.add("Rajesthan");
        stations.add("Gujrat");
        stations.add("Maharashtra");
        stations.add("Goa");
        stations.add("Andhra Pradesh");
        stations.add("Kerala");
        stations.add("Tamil Nadu");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter station1 : ");
        String station1 = input.nextLine();
        System.out.println("Please enter station2 : ");
        String station2 = input.nextLine();

        Date purchaseDate = new Date();
        int station1Index = stations.indexOf(station1);
        int station2Index = stations.indexOf(station2);
        int numberOfStops = Math.abs(station2Index - station1Index);
        int priceOfTicket = calculatePriceofTicket(numberOfStops,stations.size());

        System.out.println("Purchase date and time is : " + purchaseDate);
        System.out.println("Station1 and station2 are : " + station1 + " & " + station2);
        System.out.println("Number of stops are : " + numberOfStops);
        System.out.println(" Price of tickets are : " + priceOfTicket);
    }

    private static int calculatePriceofTicket(int numberOfStops, int size) {
        if(numberOfStops<=3){
            return 5;
        }
        if(numberOfStops == size){
            return 15;
        }
        if(numberOfStops>3 && numberOfStops<=6){
            return 15;
        }
        return 0;
    }
}
