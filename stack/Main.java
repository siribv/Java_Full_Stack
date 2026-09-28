class MyStack{
    private int[] stack;
    private int top;
    MyStack(int size){
        stack=new int[size];
        top=-1;
    }
    void push(int value){
        if(top==stack.length-1){
            System.out.println("Stack OverFlow");
            return;
        }
        top++;
        stack[top]=value;
    }
    int pop(){
        if(top==1){
            System.out.println("stack underflow");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }
    int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==stack.length-1;
    }
    int size(){
        return top+1;
    }
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack");
        for(int i=top;i>=0;i--){
            System.out.println("|"+stack[i]+"|");
        }
        System.out.println("------");
    }

}
public class Main{
    public static void main(String[] args){
        MyStack stack=new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println();
        stack.display();
        System.out.println("Top element:"+stack.peek());
        System.out.println("size:"+stack.size());
        System.out.println();
        System.out.println("popped:"+stack.pop());
        System.out.println("popped:"+stack.pop());
        System.out.println();
    }
}
