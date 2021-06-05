/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package base;

/*
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.

Challenges
Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        //input
        System.out.println("What is your name?");
        String name = in.nextLine();

        //concat
        String welcome = "Hello, "+name+", nice to meet you!";

        //output
        System.out.println(welcome);
    }
}
