package com.company;

import static java.lang.System.out;



import java.util.Scanner;

public class SandwichShop  {

    public static void main (String[] args) {
        Scanner Keyboard = new Scanner (System.in);


        int Sandwichgoal = 50;
        out.println("Checking sales goals.");
        int Sandwichsold;
        out.println("The sale goal for veggie sandwiches is 50.");
        out.println("How many sandwiches were sold?");
        Sandwichsold = Keyboard.nextInt();
        out.println("Made goal for sandwiches");


        int Burgergoal = 250;
        int Burgersold;
        out.println("The sales goal for burgers is 250.");
        out.println("How many burgers were sold? ");
        Burgersold = Keyboard.nextInt();
        out.println("Made goal for burgers");


        int Soupgoal = 70;
        int Soupsold;
        out.println("The sales goal for soups is 180.");
        out.println("How many soups were sold?");
        Soupsold = Keyboard.nextInt();

        out.println("Made goal for soup.");
        Keyboard.nextInt();

        out.println("Made goal for everything!");
         }
            }
































