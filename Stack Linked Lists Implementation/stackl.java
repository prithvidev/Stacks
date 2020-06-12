import java.util.Scanner;



public class stackl {
    Node head;
class Node{
    int data;
    Node next;
    
    Node(int d){
        data = d;
        next = null;
    }
}

    public void push(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
         System.out.println("ELEMENT PUSHED:"+d);
    }
    
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{return false;}
    }
    
    public int pop(){
        int p  = 0;
        if(head == null){
           System.out.println("Stack is Empty"); 
        }
        else{
            p = head.data;
            head = head.next;
        }
        return p;
    }
    
    public int peek(){
        if(head == null){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return head.data;
        }
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        stackl ss = new stackl();
        System.out.println("\nSTACK OPERATIONS USING LINKED LISTS\n");
        
        while(choice != 6){
            System.out.println("\nChose one from the below options...\n");  
            System.out.println("\n1.Push\n2.Pop\n3.Empty\n4.peek\n5.Display\n6.Exit");  
            System.out.println("\n Enter your choice \n");        
            choice = sc.nextInt();  
            switch(choice){
                case 1:
                {
                    int d = sc.nextInt();
                    ss.push(d);
                    break;
                }
                case 2:
                {
                    int t = ss.pop();
                    System.out.println("POPPED ELEMENT IS :"+t);
                    break;
                }
                case 3:
                {
                    boolean r = ss.isEmpty();
                    if(r == true){
                        System.out.println("STACK IS EMPTY");
                    }
                    else{System.out.println("STACK IS NOT EMPTY");}
                    break;
                }
                case 4:
                {
                    if(ss.peek() == 0){
                        System.out.println("NO ELEMENT YET");
                    }
                    else
                    {
                            
                        int y = ss.peek();
                        System.out.println("PEEK ELEMENT IS:"+y);
                    }
                    break;
                }
                case 5:
                {
                    ss.display();
                    break;
                }
                default:
                {
                    System.out.println("ENTER VALID CHOICE");
                }
            };
        }
    }
}
