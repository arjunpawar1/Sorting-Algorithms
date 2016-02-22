/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author arjun
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
      //  System.out.println("Please enter any  5 no's");
        int ar[]= {4,200,90,600,1000};
        int temp =0;
        
        System.out.println("Sorted array");
        
        
        for(int i =0;i<ar.length-1;i++)
        {
            for( int j =0;j<ar.length-i-1;j++)
            {
                if(ar[j] < ar[j+1])
                {
                temp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = temp;
                }
              
         for(int k  =0;k<ar.length;k++)
       {
    //   System.out.print(" "+ar[k]);
       }
        System.out.println();
                
            }
        
            
        }
        System.out.println();
        System.out.println("Final sorted \n");
       for(int i =0;i<ar.length;i++)
       {
       System.out.print(" "+ar[i]);
       }
        
    }
    
}
