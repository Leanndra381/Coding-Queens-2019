package com.company;

import static java.lang.System.out;



import java.util.Scanner;

public class SandwichShop  {

    public static void main (String[] args) {
        Scanner Keyboard = new Scanner(System.in);


        int sandwichGoal = 50;
        out.println("Checking sales goals.");

        out.println("The sale goal for veggie sandwiches is 50.");
        out.println("How many sandwiches were sold?");
        Keyboard.next();

        int Sandwichsold = 0;
        if (Sandwichsold <= sandwichGoal) {
            out.println("Goal Made for sandwiches!");
        } else {
            out.println("Fell short");
        }


        int Burgersold = 0;
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold? ");
        Keyboard.next();

        if (Burgersold <= 250) {
            out.println("Goal made for Burgers ");
        } else {
            out.println("Fell short");
        }


        int Soupsold = 0;

        out.println("The sales goal for soups is 180");
        out.println("How many soups were sold?");
        Keyboard.next();

        if (Soupsold <= 70) {
            out.println("Goal made for Soups");
        } else
            out.println("Fell short");
        {


            out.println("Made goal for everything!");
        }
        }
    }

