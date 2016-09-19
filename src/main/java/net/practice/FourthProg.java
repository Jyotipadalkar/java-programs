package net.practice;

import java.text.NumberFormat;

public class FourthProg {
    public static void main(String[] args){
        double value = 122135342332.322;
        NumberFormat nf= NumberFormat.getNumberInstance();
        System.out.println("Number" + nf.format(value));
        NumberFormat numf = NumberFormat.getIntegerInstance();
        System.out.println("Number:" + numf.format(value));

        //Parsing strings
        String str1 = "Hello guys! Whats up?";
        System.out.println("Length of string is:" + str1.length());
        int pos = str1.indexOf("Whats");
        System.out.println("Position:" + pos);
        String str2 = "Hello guys!      ";
        System.out.println(str2.length());
        String str3 = str2.trim();
        System.out.println(str3.length());

    }
}
