package com.java.oop.strings;

public class StringTest {
    public static void main(String[] args) {
//        charAt,compareto,comparetoignorecase,concat,lowercase,uppercase,converting string to array,equals,trim,split;
        String username = "sujith";
        String password = "abcde";
        String user = "SUJITH";
        String user1 = "     username     ";
        String user2 = "sujith";
        String empdata = "111,sujith,sujith@gmail.com";
        System.out.println(username.charAt(1));
        System.out.println(username.compareTo("sujith"));
        System.out.println(username.compareTo("SUJITH"));
        System.out.println(username.compareToIgnoreCase("sujith"));
        System.out.println(username.compareToIgnoreCase("SUJITH"));
        System.out.println(username.concat(password));
        System.out.println(username.contains("suji"));
        System.out.println(username.contains("sujih"));
        System.out.println(username.length());
        System.out.println(username.toUpperCase());
        System.out.println(user.toLowerCase());
        System.out.println(username.isEmpty());
        System.out.println(user1);
        System.out.println(user1.trim());
        System.out.println(username.equals(user2));
        char[] chars = empdata.toCharArray();
        for (char ch : chars) {
            System.out.print(ch);
        }
    }
}
