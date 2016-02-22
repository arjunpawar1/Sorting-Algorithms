/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author arjun
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int a[] ={7,2,4,10,5,3};
      
        int i;
        int hole;
        int value;
        int temp;
        for(i=1;i<a.length;i++)
        {
            hole = i;
            value = a[i];
            
            while(hole >0 && value<a[hole-1])
            {
                
             a[hole]=a[hole-1];
              hole--;
              
            }
        a[hole]= value;
            
        }
        
        for(i=0;i<a.length;i++)
        {
        System.out.print(a[i]+" ");
        }
        
    }
    
}
