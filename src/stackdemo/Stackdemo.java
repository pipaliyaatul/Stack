package stackdemo;
import java.util.*;

 class Stackdemo 
{
     
    public static void main(String[] args) 
    {
        Stackdemo stkdemo =new Stackdemo();
        stkdemo.push(10);
        stkdemo.push(20);
        stkdemo.push(30);
        stkdemo.push(45);
        stkdemo.pop();
     
        stkdemo.size();
    }

    int top=-1;
    int size=0;
    int[] stk=new int[2];
     
    void push(int x)
    {
        if(size==stk.length)
        {
            System.out.println("Can not insert");
        }          
        else
        {
           stk[size]=x;
           size++;
        }


        System.out.println("Stack now is"+x);

    }
     
    void pop()
    {

        if(size==0 )               
        {
            System.out.println("Stack is underflow cant delete any element");
        }
        else 
        {
            int result=stk[size-1];
        size--;              
        System.out.println("Stack returned value is"+result);
        }
    }
    
    void size()
    {
        int size=stk.length;

        System.out.println("The stack length is"+size);
    }
 }

    








   
 
    /*  Stack stk=new Stack();
        
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.pop();
        System.out.println("The Stack is"+stk);
        
        ArrayList al=new ArrayList();
        
        al.add(21);
        al.add(31);
        
        System.out.println("The queue is"+al);
    }
        */