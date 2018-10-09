/*
In this challenge you will recreate Hasbro.java. However, instead of retyping (because you can’t copy and paste ;) ) your code make use of a for loop to more efficiently simulate 3 sets of rolls.

Recall: Hasbro.java

Write a program that will simulate the roll of two 6-sided dice.

In your output it should list the number on each die, followed by the sum of the two dice, which represents how many places you would move. Please design the output to simulate a player playing a board game.

Note: For this program please set up your program to produce 3 instances of output in order to give an impression of how accurate the simulation is.

Roll1: 5 
Roll2: 2 
You get to move 7 spaces

Roll1: 3 
Roll2: 3 
You get to move 6 spaces

Roll1: 1 
Roll2: 1 
You get to move 2 spaces

MVP: As described

Stretch1: Can you include a counter so your output looks like this:

Roll1: 5 
Roll2: 2 
You get to move 7 spaces

Roll3: 3 
Roll4: 3 
You get to move 6 spaces

Roll5: 1 
Roll6: 1 
You get to move 2 spaces

Stretch2: Can you prompt the user for how many times they would like to roll the dice, and then have the program run that many times?

Stretch3: Can you prompt the user for what sided die they want to roll? (6-sided, 4-sided, 12-sided, etc.)
*/


import java.util.*;

public class Hasbro2 extends ConsoleProgram {
    private static int sides = 0;
    
    public void run() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int rp = 0;
        int c = 0;
        int[] randomNum = {0, 0};
        
        System.out.print("How many times would you like to roll? ");
        rp = sc.nextInt();
        
        sides = readInt("How many sides should the dice have? ");
        
        for (int i = 0; i < rp; i++) {
            for (int ia = 0; ia < 2; ia++) {
                c++;
                randomNum[ia] = randomNum();
                System.out.println("Roll" + c + ": " + randomNum[ia]);
            }
            System.out.println("You get to move " + (randomNum[0] + randomNum[1]) + " spaces \n");
        }
    }
    
    public static int randomNum() {
        int randNum = (int) (Math.random() * sides + 1);
        return randNum;
    }
}
