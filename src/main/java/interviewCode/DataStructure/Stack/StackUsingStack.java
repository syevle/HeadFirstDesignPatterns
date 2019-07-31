package interviewCode.DataStructure.Stack;



    public class StackUsingStack {
        int size;
        int arr[];
        int top;

        StackUsingStack(int size) {
            this.size = size;
            this.arr = new int[size];
            this.top = -1;
        }

        public void push(int pushedElement) {
            if (!isFull()) {
                top++;
                arr[top] = pushedElement;
            } else {
                System.out.println("Stack is full !");
            }
        }

        public int pop() {
            if (!isEmpty()) {
                int returnedTop = top;
                top--;
                return arr[returnedTop];

            } else {
                System.out.println("Stack is empty !");
                return -1;
            }
        }

        public int peek() {
            return arr[top];
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (size - 1 == top);
        }

        public static void main(String[] args) {
            StackUsingStack stackCustom = new StackUsingStack(10);
            System.out.println("=================");
            stackCustom.push(10);
            stackCustom.push(30);
            stackCustom.push(50);
            stackCustom.push(40);
            stackCustom.printStack(stackCustom);
            StackUsingStack sortedStack=sortStack(stackCustom);
            System.out.println("=================");
            System.out.println("After Sorting :");
            System.out.println("=================");
            sortedStack.printStack(sortedStack);

        }

        // Sort a stack using another stack
        public static StackUsingStack sortStack(StackUsingStack stack)
        {
            StackUsingStack tempStack = new StackUsingStack(10);
            while(!stack.isEmpty())
            {
                int currentData=stack.pop();
                while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(currentData);
            }
            return tempStack;
        }

        public  void printStack(StackUsingStack stack)
        {
            if(top>=0)
            {
                System.out.println("Elements of stacks are:");
                for (int i = 0; i <= top; i++) {
                    System.out.println(arr[i]);
                }
            }

        }
    }

