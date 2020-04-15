public class hello
{
    public static void main(String[] args) {
        
     {
        
    }
int[][] MyList = {{3,4},{7,8},};
        int total = 0;
        for (int i = 0;i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
             total += MyList[i][j];   
             System.out.println("Row:" + i + " Column:" + j +" is "+ MyList[i][j]);
             System.out.println("The sum of all levels is:" + total);
            }
          }
        }
}