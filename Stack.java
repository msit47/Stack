
public class Stack {
 private int data[];
 private int top=-1;
 
 /*initialise stack*/
 public void stackinitialize(int size)
 {
	 data=new int[size];
 }
 public void push(int ele)
 {
	 if(top==data.length-1)
		 throw new RuntimeException("Stack is full");
	 data[++top]=ele;
 }
 public int pop()
 {
	 if(top<0)
		 throw new RuntimeException("Stack is empty");
	 int element;
	 element = data[top--];
	 return element;
	 
 }
 public int peek()
 {
	 if(top<0)
		 throw new RuntimeException("Stack is Empty");
	 int readelement=data[top];
	 return readelement;
	 
 }
 public void display()
 {
	 for(int i=0;i<=top;i++)
	 {
		 System.out.println(data[i]);
	 }
 }
}