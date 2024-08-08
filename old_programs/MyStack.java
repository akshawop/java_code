import java.util.*;
class MyStack 
{
    int top;
    int arr[];
    MyStack(int size)/**constructor*/
    {
        arr = new int[size];//3
        top = -1;
    }

    void push(int value)//100
    {
        if (top == arr.length-1)//2
            System.out.println("Stack is full");
        else
            arr[++top] = value;
    }

    void pop() 
    {
        if (top == -1)
            System.out.println("Stack is empty");
        else
            top--;
    }
    
    void peek() //display
    {
        if (top == -1)
            System.out.println("Stack is empty");
        else
        {
            for(int i=top;i>=0;i--)
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);{}
        int size,ch,val;
        System.out.println("Enter stack size: ");
        do
        {
            size=sc.nextInt();
        } while(size<=0);
        
        MyStack ob=new MyStack(size);
        
        do
        {
         System.out.println("Enter\n1.Push\n2.Pop\n3.Peek");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter value in stack: ");
                val=sc.nextInt();
                ob.push(val);
                break;
                case 2:
                ob.pop();
                break;
                case 3:
                ob.peek();
                break;
                default:
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }while(ch>=1 && ch<=3);
        sc.close();
    }
}