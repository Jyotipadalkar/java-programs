package net.practice;

public class HarmonicSum {
    public static void main(String[] args) {
        StringBuffer sb;
        int denominator = 50;
        int sum =0;
        sb = new StringBuffer();
        for(denominator =1 ;denominator<=50;denominator++){
//            sum += 1/denominator;
            sb.append(" + 1/"+denominator);
        }
        System.out.println(sb);
    }
}
