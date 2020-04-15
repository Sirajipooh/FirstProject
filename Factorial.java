
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

// My Comment
    public static void main(String args[])
    {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(3));
        //f.test();
    }
}