
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {

   public static void main(String args[]) {

    System.out.println("Using FileReader");
    int bb = 1;
      try
      {
        FileReader fr = new FileReader("/Users/siraj/Documents/VSworkspace/hello/hello.world");
         char[] a = new char[50];
         fr.read(a);   // reads the contentto the array

         for(char c : a)
         System.out.print(c);   // prints the characters one by one

         fr.close();
         System.out.println("Main PAram passed is ="+args[0]+" " + args[2]);

      } 
      catch (IOException e) 
      {
        bb=2;
        System.out.print("THis is IOException");
         e.printStackTrace();
      }
      catch (Exception e) 
      {
        System.out.print("THis is Exception");
         e.printStackTrace();
      }
      // /Users/siraj/Documents/VSworkspace/hello
      bb=3;

      System.out.println("\n");
      System.out.println("Using File/Scanner");

      try {
          bb=4;
          int cc=1;
        File myObj = new File("/Users/siraj/Documents/VSworkspace/hello/hello.world");

        Scanner myReader = new Scanner(myObj);
        
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();

        {
            bb=5;
            cc=44;
        }
        
      } catch (FileNotFoundException e) {
        
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

      finally {
        System.out.println("I am in Finally Block...");
      }
    } // End of Mail method
}