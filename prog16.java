/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog16 {
    public static void main(String[] args) {
        String young = "You are not old enough to legally drive.";
        String old = "You are old enough to legally drive.";

        Scanner a = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = a.nextInt();

        String ageStr = (age >= 16) ? old : young;

        System.out.println(ageStr);
    }
}
