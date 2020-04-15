
public class Merge 
{
    void merge(int arr[], int l, int m, int r)
    {
       int Size1 = m - l + 1;
       int Size2 = r - m; 

       int L[] = new int[Size1];
       int R[] = new int[Size2];

       for (int i = 0; i < Size1; ++i)
            L[i] = arr[l+i];
        for (int j = 0; j < Size2; ++j) 
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < Size1 && j < Size2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < Size1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < Size2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {2,5,3,1}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        Merge ob = new Merge(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("Sorted array"); 
        printArray(arr); 
    } 
} 