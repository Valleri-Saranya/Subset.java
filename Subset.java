import java.util.*;
import java.io.*;

class Subset
{
 public static void main(String[] args)
 { 
   int count=0;  
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int[] Arr=new int[n];   
   System.out.println("ENTER THE ELEMENTS OF ARRAY:");
   for(int i=0;i<n;i++)
    {
     Arr[i]=s.nextInt();
    }
    System.out.println("ENTER THE NUMBER OF ELEMENTS IN SUBSET: ");
    int m=s.nextInt();
    int[] Sub=new int[m];
    System.out.println("ENTER THE ELEMENTS OF SUBSET:");
    for(int i=0;i<m;i++)
    {
     Sub[i]=s.nextInt();
    }
   Arrays.sort(Arr);
   Arrays.sort(Sub);
   for(int i=0;i<n-m;i++)
   {
       for(int j=0;j<m;j++)
       {
            if(Arr[i]==Sub[j])
              count++;
       }
   }
   if(count==m )
     System.out.println("[[[PRESENCE OF SUBSET]]]");            
   else
    System.out.println("[[[THERE IS NO SUBSET]]]");
 }
}           