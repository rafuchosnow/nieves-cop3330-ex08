package org.example;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        String peopleString = input.nextLine();
        int peopleNumber = Integer.parseInt(peopleString);

        System.out.print("How many pizzas do you have? ");
        String pizzaString = input.nextLine();
        int pizzaNumber = Integer.parseInt(pizzaString);

        System.out.print("How many slices per pizza? ");
        String sliceString = input.nextLine();
        int sliceNumber = Integer.parseInt(sliceString);

        int sliceTotal = pizzaNumber * sliceNumber;
        int slicePerson = sliceTotal / peopleNumber;
        int leftover = sliceTotal - (slicePerson * peopleNumber);

        System.out.println(peopleNumber + " people with " + pizzaNumber + " pizzas (" + sliceTotal + " slices)");
        System.out.println("Each person gets " + slicePerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}
