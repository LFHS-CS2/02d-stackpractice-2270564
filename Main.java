import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
       TestMain test = new TestMain();
       test.main(null);
    }
    
    /**
     * Write a method splitStack that takes a stack of integers as a parameter 
     * and splits it into negatives and non-negatives. The numbers in the stack 
     * should be rearranged so that all the negatives appear on the bottom of the 
     * stack and all the non-negatives appear on the top. In other words, if after 
     * this method is called you were to pop numbers off the stack, you would first 
     * get all the nonnegative numbers and then get all the negative numbers. 
     * It does not matter what order the numbers appear in as long as all the negatives 
     * appear lower in the stack than all the non-negatives. 
     * IMPORTANT: You may use only a single ArrayList as auxiliary storage. 
     */
     public static void splitStack(Stack<Integer> s)
    {
        
    }

    /**
     * Write a method stutter that takes a stack of integers as a parameter and replaces 
     * every value in the stack with two occurrences of that value. 
     * For example, suppose the stack stores these values:
     *      bottom [3, 7, 1, 14, 9] top
     * Then the stack should store these values after the method terminates:
     *      bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
     *      Notice that you must preserve the original order. 
     *      In the original list the 9 was at the top and would have been popped first. 
     *      In the new stack the two 9s would be the first values popped from the stack. 
     *      IMPORTANT: You may use only a single ArrayList as auxiliary storage to solve this problem.
     */
    public static void stutter(Stack<Integer> s)
    {
       
    }

}
