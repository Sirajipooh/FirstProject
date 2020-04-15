/*
In this class, there are two ways that you can add numbers from 1 to any given value. 
One method uses the recursive method and the other uses a for loop.
*/
public class Addition 
{
    /*
    this method uses recursivness in order to keep adding the intial value to 1.
    */
    public int add(int ad)
    {
        if ( ad <= 0)
        return 0;
        else 
        return ad+add(ad-1);
    }
    
   /*
   this method uses the for loop in order to get the sum from 1 to the given value.
   */
    public int adds(int ad)
    {   int sum = 0;
        for (int i=1; i<=ad; i++)
        {
            sum = sum + i;
            
        }
        return sum;
    }   
    public static void main
    (String args[])
    {
        Addition n = new Addition();
        int sum = n.add(5);
        System.out.println("This is the sum:" + sum);
        //Addition s = new Addition();
        System.out.println("the sum of the for loop is " + n.adds(5));
        System.out.println("the sum of the for loop is " + n.add(5));
    }


}