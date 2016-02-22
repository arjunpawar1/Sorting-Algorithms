/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Arrays;

/**
 *
 * @author arjun
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    static  int a[] = {15,234,2,3,1,34,0};
  
    public static void main(String[] args) 
    {
  
          int start = 0;
          int end =a.length -1;
          quicksort(a,start,end);
        
          System.out.println("Sorted values");
          for(int i =0;i<a.length;i++)
          {
          System.out.print(a[i]+" ");
          }
    }
    
    
    public static int partition(int a[],int start, int end)
    {
           
            int pivot = a[end]; 
            int index = start;
        
            for(int i =start;i<end;i++)
            {
               
                if(a[i]<=pivot) 
                {
               
                    swap(i,index);
                
                    index++;
                }
            }
            
            swap(end,index);
            return index;
    }
    
    public static void quicksort(int a[], int start, int end)
    {
            if(start<end) 
            {
                int partitionIndex = partition(a,start,end);
                quicksort(a,start,partitionIndex-1);
                quicksort(a,partitionIndex+1,end); 
            }
    }
    
    
    
    public static void swap(int a, int b)
    {
                int temp;
                 temp = QuickSort.a[a];
                QuickSort.a[a]=QuickSort.a[b];
                QuickSort.a[b]=temp;
    
    }
}
