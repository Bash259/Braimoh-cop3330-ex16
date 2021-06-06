/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner UserInput = new Scanner(System.in);
        int Age = UserInput.nextInt();

        if (Age < 16){
            System.out.println("You are not old enough to legally drive.");
        }else {
            System.out.println("You are old enough to legally drive.");
        }
    }
}
