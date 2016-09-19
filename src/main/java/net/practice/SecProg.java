package net.practice;

import java.text.NumberFormat;

public class SecProg {
    public static void main(String[] args) {
        int num = 42;
        String st1 = Integer.toString(num);
        System.out.println(st1);
        short num1 = 10;
        String st2 = Short.toString(num1);
        System.out.println(st2);
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String st3 = new String(chars);
        System.out.println(st3);
        char[] chars1 = st3.toCharArray();
        for(char c: chars1){
            System.out.println(c);
        }
        boolean bool = true;
        String st4 = Boolean.toString(bool);
        System.out.println(st4);
        long number = 1234567890;
        NumberFormat formater = NumberFormat.getInstance();
        String formated = formater.format(number);

        System.out.println(formated);


    }

}
