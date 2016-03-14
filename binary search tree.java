/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

public class BinarySearchTree 
{

    
    public static void main(String[] args) 
    {
       
          Node rootPointer = null;
      
        rootPointer=  Insert(rootPointer, 10);
       rootPointer=   Insert(rootPointer, 103);
       rootPointer=   Insert(rootPointer, 101);
      rootPointer=    Insert(rootPointer, 110);
          
          
         rootPointer = Insert(rootPointer,15);
         rootPointer = Insert(rootPointer,10);
         rootPointer = Insert(rootPointer,20);
         rootPointer = Insert(rootPointer,25);
         rootPointer = Insert(rootPointer,8);
         
        // int number = 20;
         if(Search(rootPointer,101)==true)
         {
             System.out.println("Found");
         }
         else
         {System.out.println("not found");}
    }
    
    static Node Insert(Node root, int value)
    {
     
        if(root == null)
        {
            root =  addNode(value);
        }
        
       else if(value <=root.data)
        {
        //insert on left side
            root.Left = Insert(root.Left,value);
        }
        else 
        {
            root.Right = Insert(root.Right, value);
        //insert on right side;
        }
        return root;
    }
    
   static boolean Search(Node root, int value)
    {
        if(root == null)return false;
       else if(root.data == value)return true;
       else if(value <= root.data){return Search(root.Left,value);}
       else {return Search(root.Right,value);}
    
    }
    
  static  Node addNode(int data)
    {
    Node new_node = new Node(data);
   
    return new_node;
    }
}

class Node
{
    int data;
    Node Right;
    Node Left;
    Node(int d)
    {
        data = d;
        Right = null;
        Left = null;
    }
}