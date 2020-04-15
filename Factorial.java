
public class Factorial 
{
    public  int fact(int n)
{
    // wrong base case (it may cause
    // stack overflow).
    if (n<= 1) 
        return 1;

    else
        return n*fact(n-1);

        
}

// this code is awesome, keep up the good work
    public static void main(String args[])
    {
        Factorial fact = new Factorial();
        System.out.println(fact.fact(5));
        
    }
}