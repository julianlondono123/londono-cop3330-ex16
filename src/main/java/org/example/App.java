import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( " What is your age?" );
        int age = input.nextInt();

        if (age < 16) {
            System.out.println("You are not old enough to legally drive");
        }
        else {
            System.out.println("You are old enough to legally drive");
        }
    }
}
