public class Hasbro extends ConsoleProgram {
    public void run() {
        dice();
        dice();
        dice();
    }
    
    public void dice() {
        // Define and initiate the rolls array.
        int[] rolls = {roll(), roll()};
        
        // Tell the user the value of each dice.
        System.out.println("Roll1: " + rolls[0]);
        System.out.println("Roll2: " + rolls[1]);
        
        // Add the rolls together.
        System.out.println("You get to move " + (rolls[0] + rolls[1]) + " spaces. \n");
    }
    
    public int roll() {
        // int roll = (int) (Math.random() * 5 + 1); // [1,6]
        
        // Stretch: use the Randomizer class from CodeHS to generate random numbers.
        int roll = Randomizer.nextInt(1, 6);
        
        return roll; // return the number rolled by the method.
    }
}
