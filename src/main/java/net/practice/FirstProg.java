package net.practice;

public class FirstProg {
    public static void main(String[] args){
        String st1 = "This is a String";
        System.out.println(st1);
        String st2 = "Shirt Size";
        String st3 = "M";
        System.out.println(st2 + ":" +st3);
        char[] ch = {'H','E','L','L','O'};
        String st = new String(ch);
        System.out.println(st);
        char[] chars = st.toCharArray();
        for (char c:chars) {
            System.out.println(c);

        }

    }

}

