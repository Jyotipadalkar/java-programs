package net.practice;

import java.util.Scanner;

public class ThirdProg {
    public static void main(String[] args){
    StringBuilder sb = new StringBuilder("Hello").append("").append("World").append("!");
        System.out.println(sb);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something!");
        String input = sc.nextLine();
        System.out.println(input);
        sb.delete(0,sb.length());
        for (int i=0 ; i<3 ;i++){
            input = sc.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }
}