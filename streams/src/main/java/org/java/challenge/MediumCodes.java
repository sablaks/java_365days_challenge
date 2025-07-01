package org.java.challenge;

public class MediumCodes {
/*
1. test equality , difference between equals() and ==
 */
    public static void main(String[] args) {
      //  testEquality();
        compress("aaabbcdddd");
      //  reversing("hello world from me");
    }

    static void testEquality(){
        String a = "1asw";
        String b = "1asw";
        String c = new String("1asw");
        String d = new String("1asw");
        String e = new String("1asw").intern();

        System.out.println("Using equals method "+ a.equals(b));
        System.out.println("Using == "+ (a == b) + " printing a " + a + " printing b " + b);
        System.out.println("Using equals method "+ c.equals(d));
        System.out.println("Using == "+ (c == d) + " printing c " + c + " printing d " + d);
        System.out.println("Using == "+ (a == e) + " printing a " + a + " printing e " + e);
    }

    static void compress(String s){
        StringBuilder builder = new StringBuilder();
        String str;
        int count = 1;
        for(int i = 1; i<s.length();i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
            else {
                builder.append(s.charAt(i)).append(count-1);
            }

        }
        System.out.println("" + builder + " length " + s.length());
    }

    static void reversing(String a){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        System.out.println("Reverse string " + sb.reverse());
    }
}
