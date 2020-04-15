
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


    public static void main(String args[])
    {
        Factorial f = new Factorial();
        System.out.println(f.fact(3));
        //f.test();
    }
}