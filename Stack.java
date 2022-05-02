import java.util.Scanner;
class Stack{
	int top=-1;
	void push(int[] a,int size, int ele){
		if(top == size-1) {
			System.out.println("Overflow");
		} else {
			top++;
			a[top] = ele;
		}
	}
	
	void pop(int[] a){
		if(top == -1) {
			System.out.println("Underflow");
		} else {
			System.out.println("The top element is ",a[top]);
			top--;
		}
	}
	public static void main(String[] args) {
		Stack s=new Stack();
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice: \n 1.Push \n 2.Pop");
			int ch=sc.nextInt();
			switch(ch) {
				case 1: System.out.println("Enter the number");
					int ele = sc.nextInt();
					s.push(a,5,ele);
					break;
				case 2: s.pop(a);
					break;
				default: System.exit(0);
			}
		}
	}
}
