/**
 * Bottles of Pop example to practice debugging and tracing code.
 * 
 * @author Andrew Muggleton
 * @version 1.0 11/05/18
 */
public class Bottles {
    
    /**
     * Prints the words for the given verse.
     * 
     * @param verse the verse to display
     */
    public static void sing(int verse) {
        if (verse > 1) {
            System.out.printf("%d bottles of pop on the wall\n", verse);
            System.out.printf("%d bottles of pop\n", verse);
            System.out.printf("If one of those bottles 
                should happen to fall\n");
            if(verse - 1 == 1)
               System.out.printf("%d bottle of pop on the wall\n", verse - 1);
            else 
               System.out.printf("%d bottles of pop on the wall\n", verse - 1);
        }
        if (verse == 1) {
            System.out.printf("%d bottle of pop on the wall\n", verse);
            System.out.printf("%d bottle of pop\n", verse);
            System.out.printf("If one of those bottles should happen to fall\n");
            System.out.printf("No more bottles of pop on the wall\n");
        }
        System.out.println();
    }
    
    /**
     * Sing each verse of the entire song (using a loop).
     * 
     * @param first the first verse of the song
     */
    public static void iterative(int first) {
        while (first > 0) {
            sing(first);
            first = first - 1;
        }
    }
    
    /**
     * Sing each verse of the entire song (using recursion).
     * 
     * @param first the first verse of the song
     */
    public static void recursive(int first) {
        if (first <= 0) {
            return; // base case
        }
        sing(first);
        recursive(first - 1);
    }
    
    /**
     * Calls the sing method for each verse.
     * 
     * @args command line arguments (optional starting verse)
     */
    public static void main(String[] args) {
        int start;
        
        // read the optional command line argument
        if (args.length > 0) {
            start = Integer.parseInt(args[0]);
        } else {
            start = 10;  // default value
        }
        
        // sing the song
        recursive(start);
    }
    
}
