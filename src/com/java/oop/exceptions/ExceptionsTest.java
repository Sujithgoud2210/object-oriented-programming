package com.java.oop.exceptions;

import java.util.Scanner;

public class ExceptionsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int noOfSubjects;
        int averageMarks;
        String username = "sujith";
        try {
            System.out.println("enter no of marks");
            marks = sc.nextInt();
            System.out.println("enter no of subjects");
            noOfSubjects = sc.nextInt();
            averageMarks = marks / noOfSubjects;
            System.out.println("average marks = " + averageMarks);
            if(username.equals("sujith")){
                System.out.println("username is matched");
            }
            int[] arr=new int[-5];


        }
        catch (NegativeArraySizeException e){
            System.out.println("array out of bounds");
        }

//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

    }
}
