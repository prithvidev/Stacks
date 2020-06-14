import java.util.Scanner;
import java.util.Stack;


public class stackCI {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*********Stack operations using array*********\n");  
        System.out.println("\n------------------------------------------------\n");  
        while(choice != 7)  
         {   
        System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Push\n2.Pop\n3.Empty\n4.peek\n5.Display\n6.Size\n7.Exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice){
            case 1:
            {
                System.out.println("Enter element to be pushed:");
                int b = sc.nextInt();
                stack.push(b);
                break;
            }
            case 2:
            {
                int y = stack.pop();
                System.out.println("Element POP:"+y);
                break;
            }  
            case 3:
            {
                boolean w = stack.empty();
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
                int y =stack.peek();
                System.out.println("Peek Elements:"+y);
                break;
            }
            case 5:
            {
                System.out.println(stack);
                break;
            }
            case 6:
            {
                int s = stack.size();
                System.out.println("Size of Stack is:"+" "+s);
            }
            default:{
                System.out.println("Enter Valid Choice");
            }
        };
    }
}
}
