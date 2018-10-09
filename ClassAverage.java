/*
I need your help calculating the class average from our last quiz. Please write a program that prompts the user for how many students are in the class. The program then reads the scores in from the user and prints out the average. Please round your answer to 2 decimal places.

Stretch1: Make your prompts easy to follow and having a numbered list: Please enter student 1’s score 
Please enter student 2’s score 
etc.

Stretch2: I also find it very helpful to know the median and mode. Can you track those for me?
*/


import java.util.*;

public class ClassAverage extends ConsoleProgram {
    // Create a HashMap that stores the score and the amount of times the score apears in the data set.
    // HashMap<Score, Count>
    private static Map<Double, Integer> countList = new HashMap<Double, Integer>();
    
    // Throw InputMismatchException to stop errors from happening with incorrect input.
    public void run() {
        // Define and initialize variables.
        int studentCount = readInt("How many students? "); // Get num of students in class with score.
        double[] scores = new double[studentCount]; // Keep scores in an array.
        double score = 0;
        double avgScore = 0;
        double median = 0;
        double mode = 0;
        
        // To find median.
        double maxScore = 0; 
        double minScore = 100;
        
        // To find mode.
        double m = 1; // MAX VARIABLE
        double t = 0; // TEMP VARIABLE
        
        
        
        for (int i = 0; i < studentCount; i++) {
            double thisScore = readDouble("Student" + (i + 1) + "'s score: "); // Get this student's score.
            score += thisScore; // Add the current student's score to the total score variable.
            scores[i] = thisScore; // Add thisScore to the scores[] array that keeps track of all of the scores.
            if (score < minScore) { // get the min score.
                minScore = score; 
            }
            if (score > maxScore) { // Get the max score.
                maxScore = score; 
            }
        }
        
        // To find the mode score.
        for (int i = 0; i < scores.length; i++) {
            if (countList.get(scores[i]) != null) { // If the countlist contains the score.    countList.containsKey(scores[i])
                int count = countList.get(scores[i]); // Int count equals the value of the key equal to the score.
                count++; // Add one to the count of the score.
                countList.put(scores[i], count); // Change the value of the key scores[i]
                
                if (count > m) { // If the count of the score is greater than the max count
                    m = count; // Increase m to the new highest count
                    t = scores[i]; // Set t to the score with the count m.
                }
            } else { // If no value for the key equal to scores[i]
                countList.put(scores[i], 1); // Enter it into the HashMap with a value of 1.
            }
        }
        
        
        // Output class averages
        System.out.println();
        
        avgScore = Math.round(score / studentCount * 100.0) / 100.0;
        System.out.println("The class's average score is " + avgScore);
        
        median = Math.round(((maxScore - minScore) / 2) * 100.0) / 100.0;
        System.out.println("The class's median score is " + median);
        
        if (m > 1.0) {
        System.out.println("The mode score is " + t + ", which occurs " + m + " times.");
        } else if (m == 1.0) {
            System.out.println("There is no mode score.");
        }
    }
}
