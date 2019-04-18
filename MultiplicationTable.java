package com.company;


import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {

	    int size = 0;







	    System.out.println("Welcome to Multiplication Table.");
        System.out.println("How large would you like to see them?");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();



     for (int counter = 0; counter <= size; counter++)
        {
            for (int columns = 0; columns <= size; columns++)
            {
                System.out.println(counter + "*" + columns + "=" + counter * columns);
            }
        }


    }
}
