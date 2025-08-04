import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int  sum = 1;
    if(n<0)
    {
        System.out.println("Invalid Input");
    }
    else{
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
    
    if(sum==n)
    {
        System.out.println("The Number "+(float)n+" is a Perfect Number.");
    }
    else{
                    System.out.println("The Number "+(float)n+" is a Not Perfect Number.");
        }
    
    }
    }
}
