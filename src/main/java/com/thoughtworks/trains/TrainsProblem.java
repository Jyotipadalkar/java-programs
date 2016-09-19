package com.thoughtworks.trains;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class TrainsProblem {
    public static void main(String[] args) {
        LinkedList<String> stations = new LinkedList<String>();
        stations.add("Chennai Beach");
        stations.add("Chennai Fort");
        stations.add("Chennai Park");
        stations.add("Chennai Egmore");
        stations.add("Chetpet");
        stations.add("Nungambakkam");
        stations.add("Kodambakkam");
        stations.add("Mambalam");
        stations.add("Saidapet");
        stations.add("Guindy");
        stations.add("St.Thomas Mount");
        stations.add("Pazhavanthangal");
        stations.add("MeenamBakkam");
        stations.add("Trisulam");
        stations.add("Pallavaram");
        stations.add("Chromepet");
        stations.add("Tambaram Sanatorium");
        stations.add("Tambaram");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first station");
        String station1 = input.nextLine();
        System.out.println("Enter second station");
        String station2 = input.nextLine();


        Date purchaseDate = new Date();
        int station1Index = stations.indexOf(station1);
        int station2Index = stations.indexOf(station2);
        int numberOfStops = Math.abs(station2Index - station1Index);
        int priceOfTicket = calculatePriceForStops(numberOfStops, stations.size()-1);

        System.out.println("Purchase Date and Time is : " + purchaseDate);
        System.out.println("Station1 and Station2 is :" + station1 + " & " + station2);
        System.out.println("Number of Stops are :" + numberOfStops);
        System.out.println("Price of ticket is : " + priceOfTicket);
    }

    private static int calculatePriceForStops(int numberOfStops, int completeStretch) {
        if (numberOfStops <= 5) {
            return 10;
        }
        if (numberOfStops == completeStretch) {
            return 20;
        }

        numberOfStops -= 5;
        int price = 10;

        while(numberOfStops >= 0) {
            price += 5;
            numberOfStops -= 5;
        }

        return price;
    }
}
