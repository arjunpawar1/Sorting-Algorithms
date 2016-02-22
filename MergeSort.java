/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

public class MergeSort 
{
int a[];
   
    public static void main(String[] args) 
    {
            int b[] = {30,45,2,1,200,0,54,1001,8575};
            
            MergeSort1(b);
            System.out.println("Sorted array "+Arrays.toString(b));
               
           
    }
    
 
 static void MergeSort1(int a[])
{
   int lengthOfA = a.length;

   if(lengthOfA <2)
   {
   return;
   }
else
   {
            int middle = lengthOfA/2; 
            int left[]= new int[middle];  
            int right[]= new int[lengthOfA-middle]; 
            
           
            for(int i =0; i<middle;i++)
            {
                    left[i] = a[i];
            }
           
            for(int i=middle;i<lengthOfA;i++)
            {
                    right[i-middle] = a[i];
            
            }
            
         
            MergeSort1(left);
            MergeSort1(right);
            Merge(left,right,a);
    
            left = null;
            right = null;
            
   }
}


static void Merge(int left[],int right[],int a[])
        {
            int nL = left.length;
            
            int rL = right.length;
            int i=0,j=0,k=0;  
            
            while(i<nL && j<rL)
            {
                if(left[i] <right[j])
                {
              
                    a[k]=left[i];
                    i++;
                    k++;
                }
                else
                {
                    a[k]=right[j];
                    j++;
                    k++;
                    
                }
            }
            
            while(i<nL)
            {
            a[k] = left[i];
            i++;k++;
            }
                 while(j<rL)
            {
            a[k] = right[j];
            j++;k++;
            }
                 
        }
        }
