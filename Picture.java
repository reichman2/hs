/*
 * Here is your chance to draw a custom picture!
 *  
 * MVP: Draw your name using a character(s) from the keyboard 
 * Stretch1: Draw a custom picture 
 * Stretch2: Draw a picture that requires Escape Characters 
 * Stretch3: Incorporate Thread.sleep into your picture
*/



public class Picture {
    public static void main(String[] args) {
        // Start here!
        
        /* 
         * MVP [x]
         * Stretch1 [x]
         * Stretch2 [x]
         * Stretch3 [x]
        */
        
        
        
        // My Name!
        String[] n = {
            "****    *****      *****     **     **     *",
            "*   *   *    *       *      *  *    * *    *",
            "*   *   *    *       *     *    *   *  *   *",
            "*****   *****        *    ********  *   *  *",
            "*    *  *    *       *    *      *  *    * *",
            "*    *  *     *      *    *      *  *     **",
            "*****   *      *   *****  *      *  *      *"
        };
        
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        
        System.out.println("\n \n \n");
        
        // My picture of a house.
        String picture[] = { // I hope this qualifies as a picture ;).
            " /\\ ___ /\\  ", // Using Escape Chars to escape the backslash (\\)
            "(   o   o )   Meow", 
            " \\  ~(*)~ /  ", //  Here too
            "  \\ _____/   " //  And Here
        };
        
        for (int ia = 0; ia < picture.length; ia++) {
            System.out.println(picture[ia]);
            
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                continue;
            }
        }
        
    }
}
