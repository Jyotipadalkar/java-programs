package net.practice;

public class Stars {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        double d = 332.12;
        String str = Double.toString(d);
        int dot = str.indexOf('.');
        System.out.println("Digits before  dot are " + dot );
        System.out.println("Digits after  dot are " + (str.length()-dot-1) );

        String st = "I love my country";
        String[] split = st.split(" ");
        String result = " ";
        for(int i =split.length -1;i>=0;i--){
            result += (split[i] + " ");
        }
        System.out.println(result.trim());

    }
}
