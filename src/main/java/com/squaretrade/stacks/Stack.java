public class Stack {

    int size = 2;
    int stack[] = new int[size];
    int top=0;

    public void push(int num) {

        if(top >= size){
            int[] newStack = new int[size * 2];

            for(int i=0; i<stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }

        stack[top] = num;
        top++;
    }

    public int pop() {
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
      return stack[top-1];
    }

    public int size() {
        return top;
    }

    public void show() {

        for(int i=0; i<top; i++) {
            System.out.print(stack[i]+" ");
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();


        //System.out.println(stack.size());
        stack.show();
    }
}
