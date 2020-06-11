
package Stacks;

import java.util.*;

   
    
    class s{
     int max=1000;
     int a[] = new int[max];
     int top ;
        
    boolean isempty(){
        if(top == -1){
            return false;
        }
        else{
            return true;
        }
    }
    
    int push(int b){
        if(top >= max-1){
            System.out.println("STACK OVERFLOW");
            return 0;
        }
        else{
            top++;
            a[top] = b;
            System.out.println("ELEMENT PUSHED");
            return b;
        }
    }
    
    int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int c = a[top--];
            return c;
        }
    }
    
    int peek(){
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
    }
    }
}

public class stacks {
    
    public static void main(String args[]){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        s ss = new s();
        System.out.println("*********Stack operations using array*********\n");  
        System.out.println("\n------------------------------------------------\n");  
        
        while(choice != 5)  
         {   
        System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Push\n2.Pop\n3.Empty\n4.peek\n5.Exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice){
            case 1:
            {
                System.out.println("Enter element to be pushed:");
                int b = sc.nextInt();
                ss.push(b);
                break;
            }
            case 2:
            {
                int y = ss.pop();
                System.out.println("Element POP:"+y);
                break;
            }  
            case 3:
            {
                boolean w = ss.isempty();
                if(w == false){
                    System.out.println("STACK IS EMPTY");
                }
                else{
                    System.out.println("STACK IS NOT EMPTY");
                }
                break;
            }
            case 4:
            {
                int y =ss.peek();
                System.out.println("Peek Elements:"+y);
                break;
            }
            default:{
                System.out.println("Enter Valid Choice");
            }
        };
        }
    }
}

