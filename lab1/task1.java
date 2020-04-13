package lab1;
import java.io.*;
public class task1 {

   public static void main(java.lang.String[] args) throws IOException {

      DataInputStream stdin = new DataInputStream (System.in);
      final int MAXINT = 50;
      final int MININT = 0;

      int[] list = new int[MAXINT+1];

      for (int i=0; i<list.length; i++) {  
         list[i] = 0;
      }   

      System.out.println ("Enter a list of integers between 0 and 50.");
      System.out.println ("To stop, enter an integer not in this range.");

      System.out.print ("Enter Integer: ");
      int value = Integer.parseInt (stdin.readLine());

      while (value >= MININT && value <= MAXINT) {
         list[value] = list[value] + 1;

         System.out.print ("Enter Integer: ");
         value = Integer.parseInt (stdin.readLine());
      }   
      
      System.out.println("\nHere are how many of each value was entered:");
      for (int i=0; i<list.length; i++) {  
         if (list[i] > 0)
            System.out.print (i+": "+list[i]);
      }   
   }
}
