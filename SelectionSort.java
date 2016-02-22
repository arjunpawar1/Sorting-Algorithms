/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author arjun
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int a[] = {50,2,65,10,400};
       
        int temp,i;
     
        for(int j = 0;j<a.length-1;j++)
        {
            int jmin = j;
                    for( i =j+1;i<a.length;i++)
                    {
                        if(a[i] > a[jmin])
                        {
                     
                            jmin =i;
                        }
                    }
                    
               
                temp = a[jmin];
                a[jmin]=a[j];
                a[j]=temp;
                
        }
        
        for( i =0;i<a.length;i++)
        {System.out.print(a[i]+" ");}
        
    }
    
}
